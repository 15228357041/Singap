package com.mingcloud.proxy.logiclayer.singaporedata;

import com.mingcloud.proxy.datalayer.dao.archiveinfo.CommonrecodeexMapper;
import com.mingcloud.proxy.datalayer.dao.archiveinfo.EnergyPatchedMapper;
import com.mingcloud.proxy.datalayer.dao.archiveinfo.PositionMapper;
import com.mingcloud.proxy.datalayer.dao.archiveinfo.StatisticslinesMapper;
import com.mingcloud.proxy.datalayer.dto.archiveinfo.EnergyPatchedDto;
import com.mingcloud.proxy.datalayer.dto.archiveinfo.SiterelationpositionDto;
import com.mingcloud.proxy.datalayer.entity.archiveinfo.CommonrecodeexEntity;
import com.mingcloud.proxy.datalayer.entity.archiveinfo.PositionEntity;
import com.mingcloud.proxy.datalayer.entity.archiveinfo.StatisticslinesEntity;
import com.mingcloud.proxy.db.DataSourceEnum;
import com.mingcloud.proxy.db.DynamicDataSource;
import com.mingcloud.proxy.util.DateHelper;
import com.mingcloud.proxy.util.PropertiesFileUtil;
import com.mingcloud.proxy.util.SpringContextUtil;

import java.math.BigDecimal;
import java.util.*;

/**
 * @Author:zxf
 * @Description
 * @Date: 2019/12/14 9:51
 */
public class SingaporeDataThread implements Runnable{
    private PositionMapper positionMapper = SpringContextUtil.getBean("positionMapper");
    private EnergyPatchedMapper energyPatchedMapper = SpringContextUtil.getBean("energyPatchedMapper");
    private CommonrecodeexMapper commonrecodeexMapper = SpringContextUtil.getBean("commonrecodeexMapper");
    private StatisticslinesMapper statisticslinesMapper = SpringContextUtil.getBean("statisticslinesMapper");
    @Override
    public void run() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                insertCommonrecodeex();
            }
        };
        // 设置执行时间
        Date date = DateHelper.getTimeThread(PropertiesFileUtil.getInstance("config").get("scheduleTime"));
        System.out.println("process startdate" + date);
        System.out.println("now date" + new Date());
        // 设置为daemon线程，当程序只有daemon线程的时候，会自动终止运行
        Timer timer = new Timer("UserDimissionTask");
        // 每天的date时刻执行task
        timer.schedule(task, date, 24 * 60 * 60 * 1000);
    }

    public void insertCommonrecodeex(){
        PositionEntity entity = new PositionEntity();
        entity.setTombstone(1);
        entity.setPositiontype(10);
        entity.setOrgid(2);
        List<SiterelationpositionDto> list = positionMapper.selectSiteId(entity);
        for (SiterelationpositionDto obj : list){
            Calendar startCalendr = Calendar.getInstance();
            Calendar endCalender = Calendar.getInstance();
           //获取前三天的数据,如果该场站有设置api抓取时间则根据api抓取时间计算
            if (obj.getApiDate() != null && obj.getApiDate().compareTo(startCalendr.getTime()) < 0){
                startCalendr.setTime(obj.getApiDate());
            }
            startCalendr.add(Calendar.DATE, -3);
            startCalendr.set(Calendar.HOUR_OF_DAY, 0);
            startCalendr.set(Calendar.MINUTE, 0);
            startCalendr.set(Calendar.SECOND, 0);
            startCalendr.set(Calendar.MILLISECOND, 0);
            endCalender.add(Calendar.DATE, -1);
            endCalender.set(Calendar.HOUR_OF_DAY, 23);
            endCalender.set(Calendar.MINUTE, 59);
            endCalender.set(Calendar.SECOND, 59);
            endCalender.set(Calendar.MILLISECOND, 0);
            obj.setStartDate(startCalendr.getTime());
            obj.setEndDate(endCalender.getTime());
            DynamicDataSource.setDataSource(DataSourceEnum.SLAVE.getName());
            List <EnergyPatchedDto> energyList = energyPatchedMapper.getTodayEnergyAndSunhours(obj);
            if (energyList == null){
                continue;
            }
            DynamicDataSource.setDataSource(DataSourceEnum.MASTER.getName());
            for(EnergyPatchedDto energyPatchedDto : energyList ) {
                //判断是否存在发电量数据
                Date date = new Date();
                CommonrecodeexEntity energyEntity = new CommonrecodeexEntity();
                energyEntity.setExtraid1(obj.getPosid());
                energyEntity.setExtravarchar1(obj.getPoskey());
                energyEntity.setExtradatetime1(energyPatchedDto.getDate());
                energyEntity.setNtype(5);
                CommonrecodeexEntity energyDayCom = commonrecodeexMapper.selectOne(energyEntity);
                if (null != energyDayCom) {
                    energyDayCom.setModificationdate(date);
                    energyDayCom.setExtradecimal1(energyPatchedDto.getEnergy());
                    commonrecodeexMapper.update(energyDayCom);
                } else {
                    energyEntity.setCreatedate(date);
                    energyEntity.setExtradecimal1(energyPatchedDto.getEnergy());
                    commonrecodeexMapper.insert(energyEntity);
                }

                //判断是否存在辐照量数据
                CommonrecodeexEntity sunHoursEntity = new CommonrecodeexEntity();
                sunHoursEntity.setExtraid1(obj.getPosid());
                sunHoursEntity.setExtravarchar1(obj.getPoskey());
                sunHoursEntity.setExtradatetime1(energyPatchedDto.getDate());
                sunHoursEntity.setNtype(10);
                CommonrecodeexEntity sunHoursDayCom = commonrecodeexMapper.selectOne(sunHoursEntity);
                if (null != sunHoursDayCom) {
                    sunHoursDayCom.setModificationdate(date);
                    sunHoursDayCom.setExtradecimal1(energyPatchedDto.getSunHours());
                    commonrecodeexMapper.update(sunHoursDayCom);
                } else {
                    sunHoursEntity.setCreatedate(date);
                    sunHoursEntity.setExtradecimal1(energyPatchedDto.getSunHours());
                    commonrecodeexMapper.insert(sunHoursEntity);
                }

                //插入每日统计表中
                StatisticslinesEntity paramEntity = new StatisticslinesEntity();
                paramEntity.setPosid(obj.getPosid());
                paramEntity.setPoskey(obj.getPoskey());
                paramEntity.setStatisticsdate(energyPatchedDto.getDate());
                StatisticslinesEntity statisticslinesEntity = statisticslinesMapper.selectOne(paramEntity);
                BigDecimal energy = energyPatchedDto.getEnergy();
                BigDecimal sunHours = energyPatchedDto.getSunHours();
                if (statisticslinesEntity != null) {
                    statisticslinesEntity.setModificationdate(new Date());
                    statisticslinesEntity.setExtradecimal7(energy);
                    statisticslinesEntity.setExtradecimal8(sunHours);
                    statisticslinesEntity.setPosabname(obj.getPosabname());
                    statisticslinesEntity.setExtradecimal1(obj.getExtradecimal1());
                    statisticslinesMapper.update(statisticslinesEntity);
                } else {
                    paramEntity.setExtradecimal7(energy);
                    paramEntity.setExtradecimal8(sunHours);
                    paramEntity.setPosabname(obj.getPosabname());
                    paramEntity.setExtradecimal1(obj.getExtradecimal1());
                    paramEntity.setCreatedate(new Date());
                    statisticslinesMapper.insert(paramEntity);
                }
            }
            //更新场站api抓取时间
            PositionEntity positionEntity = new PositionEntity();
            positionEntity.setId(obj.getPosid());
            positionEntity.setExtradatetime2(endCalender.getTime());
            positionMapper.update(positionEntity);
        }
        DynamicDataSource.clearDataSource();
    }
}
