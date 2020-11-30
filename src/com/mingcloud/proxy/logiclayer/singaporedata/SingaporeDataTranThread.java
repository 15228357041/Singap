package com.mingcloud.proxy.logiclayer.singaporedata;

import com.mingcloud.Proxy;
import com.mingcloud.proxy.datalayer.dao.archiveinfo.CommonrecodeexMapper;
import com.mingcloud.proxy.datalayer.dao.archiveinfo.EnergyPatchedMapper;
import com.mingcloud.proxy.datalayer.dao.archiveinfo.PositionMapper;
import com.mingcloud.proxy.datalayer.dto.archiveinfo.EnergyPatchedDto;
import com.mingcloud.proxy.datalayer.dto.archiveinfo.SiterelationpositionDto;
import com.mingcloud.proxy.datalayer.entity.archiveinfo.CommonrecodeexEntity;
import com.mingcloud.proxy.datalayer.entity.archiveinfo.PositionEntity;
import com.mingcloud.proxy.db.DataSourceEnum;
import com.mingcloud.proxy.db.DynamicDataSource;
import com.mingcloud.proxy.util.DateHelper;
import com.mingcloud.proxy.util.SpringContextUtil;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author:zxf
 * @Description
 * @Date: 2019/12/14 9:51
 */
public class SingaporeDataTranThread implements Runnable{
    private PositionMapper positionMapper = SpringContextUtil.getBean("positionMapper");
    private EnergyPatchedMapper energyPatchedMapper = SpringContextUtil.getBean("energyPatchedMapper");
    private CommonrecodeexMapper commonrecodeexMapper = SpringContextUtil.getBean("commonrecodeexMapper");

    @Override
    public void run() {
  /*      TimerTask task = new TimerTask() {
            @Override
            public void run() {
                insertCommonrecodeex();
            }
        };
        // 设置执行时间
        Date date = DateHelper.getTimeThread("T18:00:00.000");
        // 设置为daemon线程，当程序只有daemon线程的时候，会自动终止运行
        Timer timer = new Timer("UserDimissionTask");
        // 每天的date时刻执行task
        timer.schedule(task, date, 24 * 60 * 60 * 1000);*/
        insertCommonrecodeex();
        System.out.println("线程执行完毕");
    }

    public void insertCommonrecodeex(){
        PositionEntity entity = new PositionEntity();
        entity.setTombstone(1);
        entity.setPositiontype(10);
        entity.setSinaporetype(2);
        entity.setOrgid(2);
        List<SiterelationpositionDto> list = positionMapper.selectSiteId(entity);
        for (SiterelationpositionDto obj : list) {

            obj.setStartDate(DateHelper.stringToDate("2019-12-29", "yyyy-MM-dd"));
            obj.setEndDate(DateHelper.stringToDate("2019-12-31", "yyyy-MM-dd"));
            DynamicDataSource.setDataSource(DataSourceEnum.SLAVE.getName());
            List<EnergyPatchedDto> energyList = energyPatchedMapper.getEnergyAndSunByDate(obj);
            for (EnergyPatchedDto energyPatchedDto : energyList) {
                //判断是否存在发电量数据
                Date date = new Date();
                DynamicDataSource.setDataSource(DataSourceEnum.MASTER.getName());
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
            }
        }
        DynamicDataSource.clearDataSource();
        Proxy.flag = false;
    }
}
