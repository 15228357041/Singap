package com.mingcloud.proxy.common;

/**
 * @Author zxf
 * @Date 2019/01/09 15:01
 */
public class Constants {


    /**
     *  工单相关
     */
    /**
     *  工单类型  1-CMU;2-CMP;3-PM
     */
    public static final Integer WORKORDER_JOBTYPE_CMU = 1;
    public static final Integer WORKORDER_JOBTYPE_CMP = 2;
    public static final Integer WORKORDER_JOBTYPE_PM = 3;

    /**
     *  工单状态  1-发布;2-开始;3-完成;4停止
     */
    public static final Integer WORKORDER_JOBSTATUS_RELEASE = 1;
    public static final Integer WORKORDER_JOBSTATUS_START = 2;
    public static final Integer WORKORDER_JOBSTATUS_COMPLETE = 3;
    public static final Integer WORKORDER_JOBSTATUS_STOP = 4;

    /**
     *  日志相关
     */
    /**
     *  接口处理 1-成功;0-失败
     */
    public static final Integer LOG_EXTRAID3_SUCCESS = 1;
    public static final Integer LOG_EXTRAID3_ERROR = 0;
    /**
     *  接口内外部 1-内部接口;2-外部接口
     */
    public static final Integer LOG_EXTRAID2_IN = 1;
    public static final Integer LOG_EXTRAID2_OUT = 2;

}
