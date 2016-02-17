package cheng.lib.util;

import org.apache.commons.lang3.StringUtils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * 和时间有关的操作。
 * @author cheng
 */
public class TimeToolkit {


	/**
	 * 格式：yyyyMMdd
	 */
	public static final String dateFormat_yyyyMMdd = "yyyyMMdd";
	/**
	 * 格式：yyyy-MM-dd
	 */
	public static final String dateFormat_date = "yyyy-MM-dd";
	/**
	 * 格式：yyy年MM月dd日
	 */
	public static final String dateFormat_yyy年MM月dd日 = "yyyy年MM月dd日";
	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	public static final String dateFormat_ts = "yyyy-MM-dd HH:mm:ss";
	/**
	 * yyyy年MM月dd日 HH时mm分ss秒
	 */
	public static final String dateFormat_datetime = "yyyy年MM月dd日 HH时mm分ss秒";
	/**
	 * HH时mm分
	 */
	public static final String dateFormat_HH时mm分 = "HH时mm分";
	/**
	 * HH时mm分ss秒
	 */
	public static final String dateFormat_HH时mm分ss秒 = "HH时mm分ss秒";



	/**
	 * 返回两个时间间隔秒数
	 * @param beginTime
	 * @param endTime
	 * @return
	 */
	public static int getGapSeconds(Date beginTime, Date endTime) {
		if (beginTime != null && endTime != null) {
			Long beginLong = beginTime.getTime();
			Long endLong = endTime.getTime();
			Long result = (endLong - beginLong) / 1000;
			return result.intValue();
		}
		return 0;
	}


	public synchronized static int getCurrentYear() {

		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.YEAR);
	}
	/**
	 * 把字符串转换为指定的格式
	 * @param "yyyy-MM-dd HH:mm:ss"转换成Date
	 * @return
	 * @throws ParseException
	 */
	public synchronized static Date formatStrToDate(String str) throws ParseException {

		if (str != null && str.trim().length() > 0) {

			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat_ts);
			Date date = sdf.parse(str);
			return date;
		}
		return null;
	}
	/**
	 * 得到当前的时间
	 * @author cheng
	 * 2014年2月24日
	 * 上午11:05:09
	 * @return
	 */
	public static long gettime(){
		Date d = new Date();
		long time = d.getTime();
		d= null ;
		return time;
	}
	/**
	 * 获取当天日期所在周的开始日期和结束日期
	 */
	public static String[] convertWeekByDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //设置时间格式
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		//判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下一周去了
		int dayWeek = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天
		if (1 == dayWeek) {
			cal.add(Calendar.DAY_OF_MONTH, -1);
		}
//		System.out.println("要计算日期为:"+sdf.format(cal.getTime())); //输出要计算日期
		cal.setFirstDayOfWeek(Calendar.MONDAY);//设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
		int day = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天
		cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);//根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
		String imptimeBegin = sdf.format(cal.getTime());
//		System.out.println("所在周星期一的日期："+imptimeBegin);
		cal.add(Calendar.DATE, 6);
		String imptimeEnd = sdf.format(cal.getTime());
//		System.out.println("所在周星期日的日期："+imptimeEnd);
		return new String[]{imptimeBegin, imptimeEnd};
	}


	/**
	 * 按照指定的格式得到系统当前时间
	 * @param pattern 时间的格式
	 * @return 指定格式的时间
	 */
	public static String getCurrentDate(String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		String Clogintime = format.format(new Date());
		return Clogintime;
	}
	public static String getCurrentDate(Date date ,String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		String Clogintime = format.format(date);
		return Clogintime;
	}
	public static String getCurrentHour(String dateStr) {
		try {
			SimpleDateFormat format1 = new SimpleDateFormat(TimeToolkit.dateFormat_ts);
			Date bdate = format1.parse(dateStr);
			SimpleDateFormat format = new SimpleDateFormat("HH");
			String Clogintime = format.format(bdate);
			return Clogintime ;
		}catch (Exception e){

		}

		return "";
	}
	/**
	 * 按照指定的格式得到系统当前时间 yyyy-MM-dd
	 * @return 指定格式的时间
	 */
	public static String getCurrentDate() {
		return getCurrentDate(dateFormat_date);
	}

	/**
	 * 得到系统时间，指定为默认的格式："yyyy-MM-dd HH:mm:ss"
	 * @return 指定格式的时间
	 */
	public static String getCurrentTs() {
		return getCurrentDate(dateFormat_ts);
	}

	public static String getCurrentTs(Date date) {
		SimpleDateFormat format = new SimpleDateFormat(dateFormat_ts);
		String Clogintime = format.format(date);
		return Clogintime;
	}
	public static String getCurrentTs(Timestamp timestamp) {
		SimpleDateFormat format = new SimpleDateFormat(dateFormat_ts);
		String Clogintime = format.format(timestamp);
		return Clogintime;
	}

	/**
	 * 将（UNIX时间戳）转成普通时间
	 * @param timestampString 秒数
	 * @return
	 * @author cheng
	 * 2014年9月1日
	 * 上午10:33:38
	 */
	public static String secondToCurrentTs(String timestampString) {
		if (StringUtils.isBlank(timestampString)) {
			return TimeToolkit.getCurrentTs();
		}
		Long timestamp = Long.parseLong(timestampString);
		return secondToCurrentTs(timestamp);
	}

	/**
	 * 将（UNIX时间戳）转成普通时间
	 * @param secondtime 秒数
	 * @return
	 * @author cheng
	 * 2014年5月16日
	 * 下午5:54:23
	 */
	public static String secondToCurrentTs(long secondtime) {
		return getCurrentTs(new Date(secondtime * 1000));
	}

	/**
	 * 将当前时间转成秒（UNIX时间戳）
	 * @return
	 * @author cheng
	 * 2014年5月16日
	 * 下午5:56:59
	 */
	public static long currentTsToSecond() {
		long time = new Date().getTime();
		return time / 1000;
	}

	/**
	 * 将指定时间转成秒（UNIX时间戳）
	 * @return
	 * @author cheng
	 * 2014年5月16日
	 * 下午5:56:59
	 */
	public static long currentTsToSecond(String timestamp) {
		Date date = null;
		try {
			date = new SimpleDateFormat(dateFormat_ts).parse(timestamp);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException("所给日期格式不是  " + dateFormat_ts);
		}
		return date.getTime() / 1000;
	}

	/**
	 * 得到当前日期的后几天日期   yyyy-MM-dd
	 * @param days 具体的天数
	 * @return
	 * @throws ParseException
	 */
	public static String getNextDay(int days) {
		return getNextDay(null, days);
	}

	/**
	 * 得到指定日期的后几天日期   格式  yyyy-MM-dd
	 * @param datastr 日期 格式  yyyy-MM-dd
	 * @param days    天数
	 * @return
	 */
	public static String getNextDay(String datastr, int days) {
		return getNextDay(dateFormat_date, datastr, days);
	}

	public static String getNextDay(String dateformat, String datastr, int days) {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat(dateformat);
		if (StringUtils.isEmpty(datastr)) {
			c.setTime(new Date());
		} else {
			try {
				c.setTime(format.parse(datastr));
			} catch (ParseException e) {
				throw new RuntimeException("日期格式 不符合" + dateformat + " 格式");
			}
		}
		c.add(Calendar.DATE, days);
		String Clogintime = format.format(c.getTime());
		return Clogintime;
	}

	public static String getNextMinute(int minute) {
		return getNextMinute(null, minute);
	}

	/**
	 * @param datastr
	 * @param minute
	 * @return
	 * @author cheng
	 * 2014年7月28日
	 * 上午10:01:04
	 */
	public static String getNextMinute(String datastr, int minute) {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat(dateFormat_ts);
		if (StringUtils.isEmpty(datastr)) {
			c.setTime(new Date());
		} else {
			try {
				c.setTime(format.parse(datastr));
			} catch (ParseException e) {
				throw new RuntimeException("日期格式 不符合 yyyy-MM-dd HH:mm:ss 格式");
			}
		}
		c.add(Calendar.MINUTE, minute);
		String Clogintime = format.format(c.getTime());
		return Clogintime;
	}

	/**
	 * 取得当前日期的后几个月 几天
	 * @param datastr 日期  格式  yyyy-MM-dd
	 * @param days    天数
	 * @param mouths  月数
	 * @return
	 * @throws ParseException
	 */
	public static String getNextMouth(String datastr, int days, int mouths) {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat(dateFormat_date);
		if (StringUtils.isEmpty(datastr)) {
			c.setTime(new Date());
		} else {
			try {
				c.setTime(format.parse(datastr));
			} catch (ParseException e) {
				throw new RuntimeException("日期格式 不符合 yyyy-MM-dd 格式");
			}
		}
		c.add(Calendar.DATE, days);
		c.add(Calendar.MONTH, mouths);
		String Clogintime = format.format(c.getTime());
		return Clogintime;
	}

	public static String getNextMouth(int days, int mouths) throws ParseException {

		return getNextMouth(null, days, mouths);
	}

	/**
	 * 计算两个日期之间的天数
	 * 如果 日期一 小于 日期二  则返回正整数 该数字为两日期的差
	 * 如果 日期一 大于 日期二  则返回负整数 该数字为两日期的差
	 * 如果 日期一 等于 日期二  则返回0  两日期相等
	 * @param begindate 日期一 日期  格式  yyyy-MM-dd
	 * @param enddate   日期二 日期  格式  yyyy-MM-dd
	 * @return 该数字为两日期的差
	 */
	public static int daysBetween(String begindate, String enddate) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat_date);
			Calendar cal = Calendar.getInstance();
			cal.setTime(sdf.parse(begindate));
			long time1 = cal.getTimeInMillis();
			cal.setTime(sdf.parse(enddate));
			long time2 = cal.getTimeInMillis();
			long between_days = (time2 - time1) / (1000 * 3600 * 24);
			return Integer.parseInt(String.valueOf(between_days));
		} catch (ParseException e) {
			throw new RuntimeException("日期格式 不符合 yyyy-MM-dd 格式");
		}
	}

	/**
	 * 两个时间相减
	 *
	 * @param begindatetime
	 * @param enddatetime
	 * @return begindatetime - enddatetime
	 */
	public static int subdatetimereturnmin(String begindatetime, String enddatetime) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat_ts);
			Calendar cal = Calendar.getInstance();
			cal.setTime(sdf.parse(begindatetime));
			long time1 = cal.getTimeInMillis();
			cal.setTime(sdf.parse(enddatetime));
			long time2 = cal.getTimeInMillis();
			long between_days = (time2 - time1) / (1000 * 60);
			return Integer.parseInt(String.valueOf(between_days));
		} catch (ParseException e) {
			throw new RuntimeException("日期格式 不符合 yyyy-MM-dd HH:mm:ss 格式");
		}
	}

	/**
	 * 比较两个yyyy-MM-dd格式的日期
	 * @param begindate
	 * @param enddate
	 * @return 如果 begindate 小于 enddate 返回1 ;
	 * 如果 begindate 等于 enddate 返回 0;
	 * 如果 begindate 大于 enddate 返回 -1
	 */
	public static int compareDateOfStr(String begindate, String enddate) {
		int i = daysBetween(begindate, enddate);
		if (i > 0) {
			return 1;
		} else if (i == 0) {
			return 0;
		} else if (i < 0) {
			return -1;
		}
		return i;
	}

	/**
	 * @return
	 */
	public static String getLastDayOfMonth() {
		SimpleDateFormat format = new SimpleDateFormat(dateFormat_date);
		Calendar cDay = Calendar.getInstance();
		cDay.setTime(new Date());
		cDay.set(Calendar.DAY_OF_MONTH,
				cDay.getActualMaximum(Calendar.DAY_OF_MONTH));
		return format.format(cDay.getTime());

	}

	/**
	 * 获取 yyyy-MM-dd格式的日期的日
	 * @param date
	 * @return
	 * @author cheng
	 * 2014年8月28日
	 * 下午3:26:54
	 */
	public static String getDateDay(String date) {
		String ss = date.substring(8, 10);
		if (ss.startsWith("0")) {
			return ss.substring(1);
		}
		return ss;
	}

	/**
	 * 判断sourcetime是否在begintime  和 endtime 之间
	 * @param sourcetime 要比较的时间
	 * @param begintime  起始时间
	 * @param endtime    结束时间
	 * @return
	 */
	public static boolean isBettwenTime(String sourcetime, String begintime, String endtime) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat_ts);
			Calendar cal = Calendar.getInstance();
			cal.setTime(sdf.parse(begintime));
			long time1 = cal.getTimeInMillis();
			cal.setTime(sdf.parse(endtime));
			long time2 = cal.getTimeInMillis();
			cal.setTime(sdf.parse(sourcetime));
			long time3 = cal.getTimeInMillis();

			if (time3 - time1 > 0 && time3 - time2 < 0) {
				return true;
			} else {
				return false;
			}
		} catch (ParseException e) {
			throw new RuntimeException("日期格式 不符合 yyyy-MM-dd HH:mm:ss  格式");
		}
	}

	/**
	 * 判断当前时候是否在 begintime  和 endtime 之间
	 * @param begintime 起始时间
	 * @param endtime   结束时间
	 * @return
	 */
	public static boolean isBettwenTime(String begintime, String endtime) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat_ts);
			Calendar cal = Calendar.getInstance();
			cal.setTime(sdf.parse(begintime));
			long time1 = cal.getTimeInMillis();

			cal.setTime(sdf.parse(endtime));
			long time2 = cal.getTimeInMillis();

			cal.setTime(sdf.parse(getCurrentTs()));
			long time3 = cal.getTimeInMillis();

			if (time3 - time1 > 0 && time3 - time2 < 0) {
				return true;
			} else {
				return false;
			}
		} catch (ParseException e) {
			throw new RuntimeException("日期格式 不符合 yyyy-MM-dd HH:mm:ss  格式");
		}
	}


	public static void main(String[] aa) {
		System.out.println(isWeekend("2015-04-10"));
		System.out.println(isWeekend("2015-04-11"));
		System.out.println(isWeekend("2015-04-12"));
		System.out.println(isWeekend("2015-04-13"));

	}

	/**
	 * 判断当天是否是周末
	 * @return true :是周末  ，false 不是周末
	 */
	public static boolean isWeekend() {
		if(isWeekend(new Date())==Calendar.SATURDAY || isWeekend(new Date())==Calendar.SUNDAY){
			return true ;
		}
		return false;
	}
	/**
	 * 判断指定日期字符串是否是周末
	 * @return true :是周末  ，false 不是周末
	 */
	public static boolean isWeekend(String dateStr) {
		try {
			SimpleDateFormat format1 = new SimpleDateFormat(TimeToolkit.dateFormat_date);
			Date bdate = format1.parse(dateStr);
			if(isWeekend(bdate)==Calendar.SATURDAY || isWeekend(bdate)==Calendar.SUNDAY){
				return true ;
			}
			return false;
		} catch (Exception e) {

			return false;
		}
	}
	private static int isWeekend(Date bdate) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(bdate);
		if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
			return Calendar.SATURDAY;
		}
		if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			return Calendar.SUNDAY;
		} else {
			return -9999;
		}
	}

	/**
	 * 得到当前周末之后的第一个工作日
	 *
	 * @return yyyy-MM-dd 格式的第一个工作日日期
	 */
	public static String getFirstWeekdayFromWeekend(){
		return getFirstWeekdayFromWeekend(new Date());
	}
	/**
	 * 得到指定周末之后的第一个工作日
	 * @return yyyy-MM-dd 格式的第一个工作日日期
	 */
	public static String getFirstWeekdayFromWeekend(String dateStr){
		try {
			SimpleDateFormat format1 = new SimpleDateFormat(TimeToolkit.dateFormat_date);
			Date bdate = format1.parse(dateStr);
			return getFirstWeekdayFromWeekend(bdate);
		}catch (Exception e){
			throw new IllegalStateException("日期格式错误");
		}
	}
	public static String getFirstWeekdayFromWeekend(Date date){
		int d = isWeekend(date);
		if(d==Calendar.SUNDAY){
			return TimeToolkit.getNextDay(TimeToolkit.getCurrentDate(date, TimeToolkit.dateFormat_date), 1);
		}else if (d==Calendar.SATURDAY){
			return TimeToolkit.getNextDay(TimeToolkit.getCurrentDate(date, TimeToolkit.dateFormat_date), 2);
		}else{
			throw new IllegalStateException("非法日期");
		}
	}
}
