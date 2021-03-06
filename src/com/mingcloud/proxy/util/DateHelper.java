package com.mingcloud.proxy.util;

import com.mingcloud.proxy.datalayer.entity.archiveinfo.CommonrecodeexEntity;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public final class DateHelper {
	private static String year;

	private static String month;

	private static String day;

	private static String hour;

	private static String minute;

	private static String second;

	@SuppressWarnings("unused")
	private static String millisecond;

	private static String weekday;

	/** 日期 */
	public final static String DEFAILT_DATE_PATTERN = "yyyy-MM-dd";

	/** 日期时间 */
	public final static String DEFAILT_DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

	/** 时间 */
	public final static String DEFAULT_TIME_PATTERN = "HH:mm:ss";
	
	/**当天的起始时间时分秒*/
	public final static String DAY_START_TIME = " 00:00:00";
	
	/**当天的结束时间时分秒*/
	public final static String DAY_END_TIME = " 23:59:59";
	
	/**
	 * 把日期转化成指定的日期格式 返回String
	 * 
	 * @param date
	 * @return
	 */
	public static String dateToString(Date date, String format) {
		if (date == null)
			return " ";
		SimpleDateFormat df = new SimpleDateFormat(format);
		return df.format(date);
	}

	/**
	 * 把日期转化成指定的日期格式 返回String
	 * 
	 * @param date
	 * @return
	 * @throws
	 */
	public static Date stringToDate(String date, String format) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		try {
			return df.parse(date);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	public static Date stringToDateCommon(String date) {
		return stringToDate(date, DEFAILT_DATE_TIME_PATTERN);
	}

	public static String dateToStringCommon(Date date) {
		return dateToString(date, DEFAILT_DATE_TIME_PATTERN);
	}

	private static String[] weekday_gb = { "星期日", "星期一", "星期二", "星期三", "星期四",
			"星期五", "星期六" };

	private final static void setCurrentDate() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new java.util.Date());
		year = String.valueOf(cal.get(Calendar.YEAR));
		month = String.valueOf(cal.get(Calendar.MONTH) + 1);
		if (month.length() == 1) {
			month = "0" + month;
		}
		day = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
		if (day.length() == 1) {
			day = "0" + day;
		}
		hour = String.valueOf(cal.get(Calendar.HOUR_OF_DAY));
		if (hour.length() == 1) {
			hour = "0" + hour;
		}
		minute = String.valueOf(cal.get(Calendar.MINUTE));
		if (minute.length() == 1) {
			minute = "0" + minute;
		}
		second = String.valueOf(cal.get(Calendar.SECOND));
		if (second.length() == 1) {
			second = "0" + second;
		}
		weekday = weekday_gb[cal.get(Calendar.DAY_OF_WEEK) - 1];
		millisecond = String.valueOf(cal.get(Calendar.MILLISECOND));
	}

	public final static String getCurrentWeekDay() {
		setCurrentDate();
		return weekday;
	}

	public final static String getCurrentYear() {
		setCurrentDate();
		return year;
	}

	public final static String getCurrentMonDay() {
		setCurrentDate();
		return month + day;
	}

	public final static String getCurrentYearMonDay() {
		setCurrentDate();
		return year.substring(2) + month + day;
	}

	public final static String getCurrentTime() {
		setCurrentDate();
		return year + "-" + month + "-" + day + " " + hour + ":" + minute + ":"
				+ second;
	}

	public final static String getLastYearMon() {
		setCurrentDate();
		if (Integer.parseInt(month) == 1) {
			return getLastYear() + "12";
		} else {
			String lastMonth = String.valueOf(Integer.parseInt(month) - 1);
			if (lastMonth.length() == 1) {
				lastMonth = "0" + lastMonth;
			}
			return year + lastMonth;
		}
	}

	public final static String getLastYear() {
		setCurrentDate();
		int lastYear = Integer.parseInt(year) - 1;
		return String.valueOf(lastYear);
	}

	public final static String getCurrentMonth() {
		setCurrentDate();
		return month;
	}

	public final static String getCurrentYearMon() {
		setCurrentDate();
		return year + month;
	}

	public final static String getCurrentDate() {
		setCurrentDate();
		return year + "." + month + "." + day;
	}
	
	public final static String getCurrentDateGBK() {
		setCurrentDate();
		return year + "年" + month + "月" + day + "日";
	}

	public static Date parseDate(String datestr) {
		if (datestr != null && datestr.length() >= 19) {
			// datestr = datestr.substring(0,19);
			SimpleDateFormat df = new SimpleDateFormat(
					"yyyy-MM-dd'T'HH:mm:ss.SSS");
			try {
				return df.parse(datestr);
			} catch (ParseException e) {
				e.printStackTrace();
				throw new RuntimeException(e.getMessage());
			}
		}
		throw new RuntimeException(
				"日期格式不规范，必须为类似[2007-06-16T11:03:09.000+08:00]的格式");
	}
	
	public static Date getStartTimeOfYear() {
		setCurrentDate();
		return parseDate(year + "-01-01T00:00:00.000");
	}
	
	public static Date getEndTimeOfYear() {
		setCurrentDate();
		return parseDate(year + "-12-31T23:59:59.000");
	}
	
	public static Date getStartTimeOfMonth() {
		setCurrentDate();
		return parseDate(year + "-" + month + "-01T00:00:00.000");
	}
	
	public static Date getEndTimeOfMonth() {
		setCurrentDate();
		Calendar currCal = Calendar.getInstance();    
        int days = currCal.getActualMaximum(Calendar.DAY_OF_MONTH);  
		return parseDate(year + "-" + month + "-" + days + "T23:59:59.000");
	}
	
	public static Date getStartTimeOfDay() {
		setCurrentDate();
		return parseDate(year + "-" + month + "-" + day + "T00:00:00.000");
	}
	
	public static Date getEndTimeOfDay() {
		setCurrentDate();
		return parseDate(year + "-" + month + "-" + day + "T23:59:59.000");
	}
	
	public static Date getTimeToTriggerWordLog() {
		setCurrentDate();
		return parseDate(year + "-" + month + "-" + day + "T22:00:00.000");
	}
	
	public static Date getTimeStockDataInThread() {
		setCurrentDate();
		return parseDate(year + "-" + month + "-" + day + "T22:00:00.000");
	}
	
	public static Date getTimePurchasereDataInThread() {
		setCurrentDate();
		return parseDate(year + "-" + month + "-" + day + "T08:30:00.000");
	}

	public static Date getTimeThread(String timeStr) {
		setCurrentDate();
		return parseDate(year + "-" + month + "-" + day + timeStr);
	}

	public static void main(String[] args) {
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.out.println(new Date());
			}
		};
		// 设置执行时间
		Date date = DateHelper.getTimeThread("T09:33:00.000");
		System.out.println("process startdate" + date);
		System.out.println("now date" + new Date());
		// 设置为daemon线程，当程序只有daemon线程的时候，会自动终止运行
		Timer timer = new Timer("UserDimissionTask");
		// 每天的date时刻执行task
		timer.schedule(task, date,   60 * 1000);
	}

	/**
	 *
	 * 描述:获取下一个月天数.
	 *
	 * @return
	 */
	public static Integer getPreMonth(Date date, Integer num) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, num);
		int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		return days;
	}

	/**
	 *
	 * 描述两个时间相隔的年丰
	 *
	 * @return
	 */
	public static Integer getYears(Date maxDate, Date minDate) {
		Calendar bef = Calendar.getInstance();
		bef.setTime(minDate);
		Calendar aft = Calendar.getInstance();
		aft.setTime(maxDate);
		int year = aft.get(Calendar.YEAR) - bef.get(Calendar.YEAR);
		return year;
	}

	/**
	 *
	 * 描述:获取今天days天后的日期.
	 *
	 * @return
	 */
	public static Date afterDays(Integer days) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, days);
		Date date = cal.getTime();
		return date;
	}

	/**
	 * 获取指定时间对应的毫秒数
	 * @param time "HH:mm:ss"
	 * @return
	 */
	public static long getTimeMillis(String time) {
		try {
			DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
			DateFormat dayFormat = new SimpleDateFormat("yy-MM-dd");
			Date curDate = dateFormat.parse(dayFormat.format(new Date()) + " " + time);
			return curDate.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
