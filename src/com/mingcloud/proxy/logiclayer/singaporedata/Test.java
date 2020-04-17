package com.mingcloud.proxy.logiclayer.singaporedata;

import com.mingcloud.Proxy;
import com.mingcloud.proxy.datalayer.dao.archiveinfo.CommonrecodeexMapper;
import com.mingcloud.proxy.datalayer.dao.archiveinfo.EnergyPatchedMapper;
import com.mingcloud.proxy.datalayer.dao.archiveinfo.PositionMapper;
import com.mingcloud.proxy.datalayer.dao.archiveinfo.StatisticslinesMapper;
import com.mingcloud.proxy.datalayer.dto.archiveinfo.SiterelationpositionDto;
import com.mingcloud.proxy.datalayer.entity.archiveinfo.CommonrecodeexEntity;
import com.mingcloud.proxy.datalayer.entity.archiveinfo.PositionEntity;
import com.mingcloud.proxy.datalayer.entity.archiveinfo.StatisticslinesEntity;
import com.mingcloud.proxy.util.DateHelper;
import com.mingcloud.proxy.util.SpringContextUtil;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/**
 * @Author:zxf
 * @Description
 * @Date: 2019/12/14 9:51
 */
public class Test implements Runnable{
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
        Date startDate= DateHelper.getStartTimeOfYear();
        Date endDate = DateHelper.stringToDate("2019-12-31", "yyyy-MM-dd");
        System.out.println(startDate);
        System.out.println(endDate);
        System.out.println(DateHelper.dateToString(startDate, "yyyy-MM-dd"));
        TimeZone zone = TimeZone.getDefault();// 获得当前时区
        System.out.println("当前主机所在时区：" + zone.getDisplayName());// 获得时区的名字

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        TimeZone zone2 = df.getTimeZone();
        TimeZone zone3 = TimeZone.getTimeZone("Asia/Shanghai");
        System.out.println("格式化时间时区：" + zone2.getDisplayName());// 获得时区的名字
        System.out.println("东八区时区：" + zone3.getDisplayName());// 获得时区的名字
    }
}
