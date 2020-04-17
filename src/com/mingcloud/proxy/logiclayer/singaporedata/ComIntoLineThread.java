package com.mingcloud.proxy.logiclayer.singaporedata;

import com.mingcloud.Proxy;
import com.mingcloud.proxy.datalayer.dao.archiveinfo.CommonrecodeexMapper;
import com.mingcloud.proxy.datalayer.dao.archiveinfo.EnergyPatchedMapper;
import com.mingcloud.proxy.datalayer.dao.archiveinfo.PositionMapper;
import com.mingcloud.proxy.datalayer.dao.archiveinfo.StatisticslinesMapper;
import com.mingcloud.proxy.datalayer.dto.archiveinfo.EnergyPatchedDto;
import com.mingcloud.proxy.datalayer.dto.archiveinfo.SiterelationpositionDto;
import com.mingcloud.proxy.datalayer.dto.archiveinfo.StatisticslinesDto;
import com.mingcloud.proxy.datalayer.entity.archiveinfo.CommonrecodeexEntity;
import com.mingcloud.proxy.datalayer.entity.archiveinfo.PositionEntity;
import com.mingcloud.proxy.datalayer.entity.archiveinfo.StatisticslinesEntity;
import com.mingcloud.proxy.db.DataSourceEnum;
import com.mingcloud.proxy.db.DynamicDataSource;
import com.mingcloud.proxy.util.DateHelper;
import com.mingcloud.proxy.util.SpringContextUtil;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author:zxf
 * @Description
 * @Date: 2019/12/14 9:51
 */
public class ComIntoLineThread implements Runnable{
    private PositionMapper positionMapper = SpringContextUtil.getBean("positionMapper");
    private EnergyPatchedMapper energyPatchedMapper = SpringContextUtil.getBean("energyPatchedMapper");
    private CommonrecodeexMapper commonrecodeexMapper = SpringContextUtil.getBean("commonrecodeexMapper");
    private StatisticslinesMapper statisticslinesMapper = SpringContextUtil.getBean("statisticslinesMapper");

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
        insertStatiscLines();
        System.out.println("线程执行完毕");
    }

    public void insertStatiscLines(){
        PositionEntity entity = new PositionEntity();
        entity.setTombstone(1);
        entity.setPositiontype(10);
        entity.setOrgid(2);
        List<SiterelationpositionDto> list = positionMapper.selectSiteId(entity);
        for (SiterelationpositionDto obj : list) {
            Date startDate= DateHelper.stringToDate("2019-12-29", "yyyy-MM-dd");
            Date endDate = DateHelper.stringToDate("2019-12-31", "yyyy-MM-dd");
            while(!startDate.equals(endDate)){
                CommonrecodeexEntity energyEntity = new CommonrecodeexEntity();
                energyEntity.setExtraid1(obj.getPosid());
                energyEntity.setExtravarchar1(obj.getPoskey());
                energyEntity.setNtype(5);
                energyEntity.setExtradatetime1(startDate);
                CommonrecodeexEntity energyDayCom = commonrecodeexMapper.selectOne(energyEntity);

                CommonrecodeexEntity sunHoursEntity = new CommonrecodeexEntity();
                sunHoursEntity.setExtraid1(obj.getPosid());
                sunHoursEntity.setExtravarchar1(obj.getPoskey());
                sunHoursEntity.setExtradatetime1(startDate);
                sunHoursEntity.setNtype(10);
                CommonrecodeexEntity sunHoursDayCom = commonrecodeexMapper.selectOne(sunHoursEntity);
                StatisticslinesEntity paramEntity = new StatisticslinesEntity();
                paramEntity.setPosid(obj.getPosid());
                paramEntity.setPoskey(obj.getPoskey());
                paramEntity.setStatisticsdate(startDate);
                StatisticslinesEntity statisticslinesEntity =  statisticslinesMapper.selectOne(paramEntity);
                BigDecimal energy = null == energyDayCom ? BigDecimal.ZERO : energyDayCom.getExtradecimal1();
                BigDecimal sunHours = null == sunHoursDayCom ? BigDecimal.ZERO : sunHoursDayCom.getExtradecimal1();
                if (statisticslinesEntity != null){
                    statisticslinesEntity.setModificationdate(new Date());
                    statisticslinesEntity.setExtradecimal7(energy);
                    statisticslinesEntity.setExtradecimal8(sunHours);
                    statisticslinesEntity.setExtradecimal1(obj.getExtradecimal1());
                    statisticslinesEntity.setPosabname(obj.getPosabname());
                    statisticslinesMapper.update(statisticslinesEntity);
                }else{
                    paramEntity.setExtradecimal7(energy);
                    paramEntity.setExtradecimal8(sunHours);
                    paramEntity.setExtradecimal1(obj.getExtradecimal1());
                    paramEntity.setCreatedate(new Date());
                    paramEntity.setPosabname(obj.getPosabname());
                    statisticslinesMapper.insert(paramEntity);
                }
                Calendar startCalendr = Calendar.getInstance();
                startCalendr.setTime(startDate);
                startCalendr.add(Calendar.DATE, 1);
                startDate = startCalendr.getTime();
            }
        }
        Proxy.flag = false;
    }
}
