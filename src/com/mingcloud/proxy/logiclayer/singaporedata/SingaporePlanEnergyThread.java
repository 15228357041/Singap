package com.mingcloud.proxy.logiclayer.singaporedata;

import com.mingcloud.Proxy;
import com.mingcloud.proxy.datalayer.dao.archiveinfo.*;
import com.mingcloud.proxy.datalayer.dto.archiveinfo.DictionaryDto;
import com.mingcloud.proxy.datalayer.dto.archiveinfo.EnergyPatchedDto;
import com.mingcloud.proxy.datalayer.dto.archiveinfo.SiterelationpositionDto;
import com.mingcloud.proxy.datalayer.entity.archiveinfo.*;
import com.mingcloud.proxy.db.DataSourceEnum;
import com.mingcloud.proxy.db.DynamicDataSource;
import com.mingcloud.proxy.util.DateHelper;
import com.mingcloud.proxy.util.SpringContextUtil;

import java.math.BigDecimal;
import java.util.*;

/**
 * @Author:zxf
 * @Description
 * @Date: 2019/12/14 9:51
 */
public class SingaporePlanEnergyThread implements Runnable{
    private PositionMapper positionMapper = SpringContextUtil.getBean("positionMapper");
    private DictionaryMapper dictionaryMapper = SpringContextUtil.getBean("dictionaryMapper");
    private PlannedelectricMapper plannedelectricMapper = SpringContextUtil.getBean("plannedelectricMapper");
    @Override
    public void run() {
        insertPlanEnergy();
        System.out.println("线程执行完毕");
        Proxy.flag = false;
        /*TimerTask task = new TimerTask() {
            @Override
            public void run() {
                insertPlanEnergy();
                System.out.println("线程执行完毕");
            }
        };
        // 设置执行时间
        Date date = DateHelper.getTimeThread("T18:00:00.000");
        // 设置为daemon线程，当程序只有daemon线程的时候，会自动终止运行
        Timer timer = new Timer("SingaporeEnergyTask");
        // 每天的date时刻执行task
        timer.schedule(task, date, 24 * 60 * 60 * 1000);*/
    }

    public void insertPlanEnergy() {
        //获取新加坡的场站
        PositionEntity positionEntity = new PositionEntity();
        positionEntity.setOrgid(2);
        positionEntity.setPositiontype(10);
        positionEntity.setTombstone(1);
        List <PositionEntity> positionEntityList = positionMapper.select(positionEntity);
        //获取字典数据12月的系统辐照
        DictionaryEntity paramDto = new DictionaryEntity();
        paramDto.setDictype(1);
        paramDto.setTombstone(1);
        List <DictionaryEntity> dictionaryEntityList = dictionaryMapper.select(paramDto);
        for (PositionEntity position : positionEntityList){
            Date startDate = DateHelper.getStartTimeOfYear();
            Date endDate = DateHelper.getEndTimeOfYear();
            Calendar startCalendr = Calendar.getInstance();
            startCalendr.setTime(startDate);
            while(startDate.compareTo(endDate) < 0) {
                PlannedelectricEntity plannedelectricEntity = new PlannedelectricEntity();
                plannedelectricEntity.setStationid(position.getId());
                plannedelectricEntity.setTombstone(1);
                plannedelectricEntity.setPlandate(startDate);
                PlannedelectricEntity planEnergy = plannedelectricMapper.selectOne(plannedelectricEntity);
                BigDecimal sunHours = new BigDecimal(dictionaryEntityList.get(startCalendr.get(Calendar.MONTH)).getDicvalue());
                //判断场站是否有装机容量和投云时间如果没有投运时间则默认为第一年
                Date currentDate = new Date();
                int year = position.getExtradatetime1() != null ? DateHelper.getYears(currentDate, position.getExtradatetime1()) : 0;
                BigDecimal ronliang = position.getExtradecimal1() != null ? position.getExtradecimal1() : BigDecimal.ZERO;
                BigDecimal energy = sunHours.multiply(ronliang).multiply(new BigDecimal(750)).multiply(new BigDecimal(0.99).pow(year));
                if (null != planEnergy) {
                    planEnergy.setIncidencerate(energy);
                    plannedelectricMapper.update(planEnergy);
                } else {
                    plannedelectricEntity.setIncidencerate(energy);
                    plannedelectricMapper.insert(plannedelectricEntity);
                }
                startCalendr.add(Calendar.MONTH, 1);
                startDate = startCalendr.getTime();
            }
        }
    }
}
