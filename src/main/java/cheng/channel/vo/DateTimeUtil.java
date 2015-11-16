package cheng.channel.vo;

import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * 对日期进行格式化处理的类，由于java的SimpleDateFormat对null不进行处理，所以对其进行封装 使用静态函数
 * 
 */
public class DateTimeUtil {

	// 缺省的格式
	public static String shortintDateFormatText = "yyyyMMdd";
	/**
	 * yyyy-MM-dd 
	 */
	public static String shortDateFormatText = "yyyy-MM-dd";
	private static String longDateFormatText = "yyyy年MM月dd日";
	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	private static String shortDateTimeFormatText = "yyyy-MM-dd HH:mm:ss";
	private static String longDateTimeFormatText = "yyyy年MM月dd日 HH时mm分ss秒";
	private static String shortTimeToMinuteFormatText = "HH:mm";
	private static String shortTimeToSecondFormatText = "HH:mm:ss";
	private static String longTimeToMinuteFormatText = "HH时mm分";
	private static String longTimeToSecondFormatText = "HH时mm分ss秒";
	private static String weekDays[] = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
	
	public static String getShortintDateFormatText() {
		return shortintDateFormatText;
	}

	public static String getShortDateFormatText() {
		return shortDateFormatText;
	}
	public static String getLongDateFormatText() {
		return longDateFormatText;
	}

	public static String getShortDateTimeFormatText() {
		return shortDateTimeFormatText;
	}
	public static String getLongDateTimeFormatText() {
		return longDateTimeFormatText;
	}

	public static String getShortTimeToMinuteFormatText() {
		return shortTimeToMinuteFormatText;
	}
	public static String getShortTimeToSecondFormatText() {
		return shortTimeToSecondFormatText;
	}

	public static String getLongTimeToMinuteFormatText() {
		return longTimeToMinuteFormatText;
	}
	public static String getLongTimeToSecondFormatText() {
		return longTimeToSecondFormatText;
	}

	private static SimpleDateFormat getShortintDateSDF() {
		return new SimpleDateFormat(shortintDateFormatText);
	}
	
	private static SimpleDateFormat getShortDateSDF() {
		return new SimpleDateFormat(shortDateFormatText);
	}
	private static SimpleDateFormat getLongDateSDF() {
		return new SimpleDateFormat(longDateFormatText);
	}

	private static SimpleDateFormat getShortDateTimeSDF() {
		return new SimpleDateFormat(shortDateTimeFormatText);
	}
	private static SimpleDateFormat getLongDateTimeSDF() {
		return new SimpleDateFormat(longDateTimeFormatText);
	}

	private static SimpleDateFormat getShortTimeToMinuteSDF() {
		return new SimpleDateFormat(shortTimeToMinuteFormatText);
	}
	private static SimpleDateFormat getShortTimeToSecondSDF() {
		return new SimpleDateFormat(shortTimeToSecondFormatText);
	}

	private static SimpleDateFormat getLongTimeToMinuteSDF() {
		return new SimpleDateFormat(longTimeToMinuteFormatText);
	}
	private static SimpleDateFormat getLongTimeToSecondSDF() {
		return new SimpleDateFormat(longTimeToSecondFormatText);
	}

	private static SimpleDateFormat getSDF(String formatText) {
		return new SimpleDateFormat(formatText);
	}
	public static Date getShortDate(String dateString) {
		if (dateString == null || dateString.length() == 0) {
			return null;
		} else {
			try {
				return getShortDateSDF().parse(dateString);
			} catch (ParseException e) {
				return null;
			}
		}
	}

	public static Date getLongDate(String dateString) {

		if (dateString == null || dateString.length() == 0) {
			return null;
		} else {
			try {
				return getLongDateSDF().parse(dateString);
			} catch (ParseException e) {
				return null;
			}
		}
	}

	public static Date getShortDateTime(String dateString) {

		if (dateString == null || dateString.length() == 0) {
			return null;
		} else {
			try {
				return getShortDateTimeSDF().parse(dateString);
			} catch (ParseException e) {
				return null;
			}
		}
	}

	public static Date getLongDateTime(String dateString) {

		if (dateString == null || dateString.length() == 0) {
			return null;
		} else {
			try {
				return getLongDateTimeSDF().parse(dateString);
			} catch (ParseException e) {
				return null;
			}
		}
	}

	public static Date getShortTimeToMinute(String dateString) {

		if (dateString == null || dateString.length() == 0) {
			return null;
		} else {
			try {
				return getShortTimeToMinuteSDF().parse(dateString);
			} catch (ParseException e) {
				return null;
			}
		}
	}

	public static Date getShortTimeToSecond(String dateString) {

		if (dateString == null || dateString.length() == 0) {
			return null;
		} else {
			try {
				return getShortTimeToSecondSDF().parse(dateString);
			} catch (ParseException e) {
				return null;
			}
		}
	}

	public static Date getLongTimeToMinute(String dateString) {

		if (dateString == null || dateString.length() == 0) {
			return null;
		} else {
			try {
				return getLongTimeToMinuteSDF().parse(dateString);
			} catch (ParseException e) {
				return null;
			}
		}
	}

	public static Date getLongTimeToSecond(String dateString) {

		if (dateString == null || dateString.length() == 0) {
			return null;
		} else {
			try {
				return getLongTimeToSecondSDF().parse(dateString);
			} catch (ParseException e) {
				return null;
			}
		}
	}

	public static Date getDate(String dateString, String formatText) {

		if (dateString == null || dateString.length() == 0) {
			return null;
		} else {
			try {
				return getSDF(formatText).parse(dateString);
			} catch (ParseException e) {
				return null;
			}
		}
	}

	public static String getShortintDateString(Date date) {

		if (date == null) {
			return "";
		} else {
			return getShortintDateSDF().format(date);
		}
	}
	
	public static String getLongDateString(Date date) {

		if (date == null) {
			return "";
		} else {
			return getLongDateSDF().format(date);
		}
	}
	

	public static String getShortDateString(Date date) {

		if (date == null) {
			return "";
		} else {
			return getShortDateSDF().format(date);
		}
	}

	public static String getShortDateTimeString(Date date) {

		if (date == null) {
			return "";
		} else {
			return getShortDateTimeSDF().format(date);
		}
	}

	public static String getLongDateTimeString(Date date) {

		if (date == null) {
			return "";
		} else {
			return getLongDateTimeSDF().format(date);
		}
	}

	public static String getShortTimeToMinuteString(Date date) {

		if (date == null) {
			return "";
		} else {
			return getShortTimeToMinuteSDF().format(date);
		}
	}

	public static String getShortTimeToSecondString(Date date) {

		if (date == null) {
			return "";
		} else {
			return getShortTimeToSecondSDF().format(date);
		}
	}

	public static String getLongTimeToMinuteString(Date date) {

		if (date == null) {
			return "";
		} else {
			return getLongTimeToMinuteSDF().format(date);
		}
	}

	public static String getLongTimeToSecondString(Date date) {

		if (date == null) {
			return "";
		} else {
			return getLongTimeToSecondSDF().format(date);
		}
	}

	public static String getString(Date date, String formatText) {

		if (date == null) {
			return "";
		} else {
			return getSDF(formatText).format(date);
		}
	}

	/** 
     * 获取date是星期几 
     * @param date 
     * @return date是星期几 
     */ 
	public static String getWeekOfDate(Date date) {
		Calendar cal = Calendar.getInstance();
        cal.setTime(date); 

        int w = cal.get(Calendar.DAY_OF_WEEK) - 1; 
        if (w < 0) 
            w = 0; 

        return weekDays[w]; 
	}

	public static boolean DatePartEquals(Calendar calendar1, Calendar calendar2) {

		return (calendar1.get(Calendar.YEAR) == calendar2.get(Calendar.YEAR) && calendar1.get(Calendar.MONTH) == calendar2.get(Calendar.MONTH) && calendar1.get(Calendar.DATE) == calendar2.get(Calendar.DATE));
	}
	
	public static String dateTimeToShortDate(String dateTime){
		return getShortDateString(DateTimeUtil.getShortDateTime(dateTime));
	}
	
	public static String addTimeToDate(String dateTime,int days){
		String time = "";
		if(!StringUtils.isEmpty(dateTime)){
			Date date = getShortDateTime(dateTime);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.DATE, days);
			time = getShortDateTimeString(cal.getTime());
		}
		return time;
	}
	
	public static String addDay(String dateStr,int days){
		String time = "";
		if(!StringUtils.isEmpty(dateStr)){
			Date date = getShortDate(dateStr);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.DATE, days);
			time = getShortDateString(cal.getTime());
		}
		return time;
	}
	
	public static Calendar getDateAddMinute(Calendar calendar,int addNumOfMinute){   
		calendar.add(Calendar.MINUTE,addNumOfMinute);
		  return calendar;   
	}
	
	public static Calendar getDateAddHour(Calendar calendar,int addNumOfHour){   
		calendar.add(Calendar.HOUR,addNumOfHour);
		  return calendar;   
	}  
	
	public static Calendar getDateAddMonth(Calendar calendar,int addNumOfMonth){   
		  calendar.add(Calendar.MONTH,addNumOfMonth);   
		  return calendar;   
	} 
	
	public static Calendar getDateAddDay(Calendar calendar,int addNumOfDay){   
		  calendar.add(Calendar.DATE,addNumOfDay);   
		  return calendar;   
	} 
	
	public static Date getAddMonth(Date date,int addNumOfMonth){   
		  Calendar c=Calendar.getInstance();
		  c.setTime(date); 
		  return getDateAddMonth(c,addNumOfMonth).getTime(); 
	} 
	
	public static Date getAddDay(Date date,int addNumOfDay){   
		  Calendar c=Calendar.getInstance();
		  c.setTime(date); 
		  return getDateAddDay(c,addNumOfDay).getTime(); 
	} 
	
	public static Date getAddHour(Date date,int addNumOfHour){   
		  Calendar c=Calendar.getInstance();
		  c.setTime(date); 
		  return getDateAddHour(c,addNumOfHour).getTime(); 
	} 
	
	public static Date getAddMinute(Date date,int addNumOfMinute){   
		  Calendar c=Calendar.getInstance();
		  c.setTime(date); 
		  return getDateAddMinute(c,addNumOfMinute).getTime(); 
	}
	
	/**
	 * 利息计算：开始时间是T+1，结束时间：   获取投资利息计算的最后一天
	 * @param startDate 利息计算开始时间
	 * @param period    期数
	 * @return 例如：startDate:2014-02-14  period:2 return 2014-04-13 
	 */
	public static String getInvestEndDay(Date startDate,int period){   
		  Calendar c=Calendar.getInstance();
		  c.setTime(startDate); 
		  c=getDateAddDay(getDateAddMonth(c,period),-1); 
		  String result=DateTimeUtil.getShortDateString(c.getTime());
		  return result;
	}
	
	/**
	 * 返回date+月数  的日期
	 * @param date  java Date类型
	 * @param addNumOfMonth 增加的月数(-/+都可以)
	 * @return
	 */
	public static Date getDateAddMonth(Date date,int addNumOfMonth){   
		  Calendar   calendar=Calendar.getInstance();   
		  calendar.setTime(date);   
		  int   month=calendar.get(Calendar.MONTH);   
		  calendar.set(Calendar.MONTH,month+addNumOfMonth);   
		  return calendar.getTime();   
	}   
	
	public static String getSellProjectPeriod(Date startDate,Date endDate){   
		  return getSellProjectPeriod(startDate,endDate,new Date());   
	}  
	public static String getSellProjectPeriod(Date startDate,Date endDate,Date cur){  
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
		String startStr = df.format(startDate);
		String endStr = df.format(endDate);  
		String curStr = df.format(cur);
		 return getSellProjectPeriod(startStr,endStr,curStr);
	} 
	
	/**
	 * 
	 * @param startStr
	 * @param endStr
	 * @return 剩余期数/总期数
	 */
	public static String getSellProjectPeriod(String startStr,String endStr){  
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
		String curStr = df.format(new Date());
		return getSellProjectPeriod(startStr,endStr,curStr);  
	}
	/**
	 * 
	 * @param startStr
	 * @param endStr
	 * @param curStr
	 * @return 剩余期数/总期数
	 */
	public static String getSellProjectPeriod(String startStr,String endStr,String curStr){  
		int others=calcPeriod(curStr,endStr);
		int sum=calcPeriod(startStr,endStr);
		return others+"/"+sum;   
	}
	
	/**  
	* @param stype 返回值类型   0为多少天，1为多少个月，2为多少年
	* @return  
	* 举例：
	* compareDate("2009-09-12", null, 0);//比较天
	* compareDate("2009-09-12", null, 1);//比较月
	* compareDate("2009-09-12", null, 2);//比较年
	* compareDate("2014-01-12","2014-01-12",0); 0天
	* compareDate("2014-01-12","2014-01-13",0); 1天
	* compareDate("2014-01-14","2014-01-13",0); -1天
	*/ 
	public static int compareDate(String startDay,String endDay,int stype){  
	int n = 0;  
	String[] u = {"天","月","年"};  
	String formatStyle= (stype==1)?"yyyy-MM":"yyyy-MM-dd";  
	DateFormat df = new SimpleDateFormat(formatStyle);  
	endDay = (endDay==null)?df.format(new Date()):endDay;  
	Calendar c1 = Calendar.getInstance();  
	Calendar c2 = Calendar.getInstance();  
	try {  
	    c1.setTime(df.parse(startDay));  
	    c2.setTime(df.parse(endDay));  
	} catch (Exception e3) {  
	  System.out.println("wrong occured");  
	}  
	//List list = new ArrayList();  
	while (!(c1.after(c2))) {                   // 循环对比，直到相等，n 就是所要的结果  
	   //list.add(df.format(c1.getTime()));    // 这里可以把间隔的日期存到数组中 打印出来  
	  n++;  
	  if(stype==1){  
	    c1.add(Calendar.MONTH, 1);          // 比较月份，月份+1  
	  }else{
	    c1.add(Calendar.DATE, 1);           // 比较天数，日期+1  
	  }  
	}  
	    n = n-1;  
	if(stype==2){  
	   n = (int)n/365;  
	}     
	   System.out.println(startDay+" -- "+endDay+" 相差多少"+u[stype]+":"+n);        
	   return n;  
	}   
	
	/**
	 * 计算两个日期之间的期数，不够整月的取整
	 * @param startDay
	 * @param endDay
	 * @return
	 */
	public static int calcPeriod(String startDay,String endDay){  
	int n = 0;  
	String formatStyle= "yyyy-MM-dd";  
	DateFormat df = new SimpleDateFormat(formatStyle);  
	endDay = (endDay==null)?df.format(new Date()):endDay;  
	startDay = (startDay==null)?df.format(new Date()):endDay;  
	Calendar c1 = Calendar.getInstance();  
	Calendar c2 = Calendar.getInstance();  
	try {  
	    c1.setTime(df.parse(startDay));  
	    c2.setTime(df.parse(endDay));  
	} catch (Exception e3) {  
	  System.out.println("wrong occured");  
	}  
	//List list = new ArrayList();  
	while (!(c1.after(c2))) {                   // 循环对比，直到相等，n 就是所要的结果  
	   //list.add(df.format(c1.getTime()));    // 这里可以把间隔的日期存到数组中 打印出来  
	    n++;  
	    c1.add(Calendar.MONTH, 1);          // 比较月份，月份+1  
	}  
	    n = n-1;  
	   System.out.println(startDay+" -- "+endDay+" 相差多少期:"+n);        
	   return n+1;  
	} 
	
	public static void main(String[] args) {
//		DateTimeUtil.getDays(null,null);
		System.out.println("sdfdsf");
	}

	/**
	 * 格式化时间
	 * @param date
	 * @param format
	 * @return
	 */
	public static String getDateTimeStr(Date date, String format) {
		return new SimpleDateFormat(format).format(date);
	}
	
	public static List<String> getDaysList(Date startDate, Date endDate) {
	Calendar beg=Calendar.getInstance();
	Calendar end=Calendar.getInstance();
	beg.setTime(startDate);
	end.setTime(endDate);

	//获取连续的日期
    List<String> list=new ArrayList<String>();
	SimpleDateFormat sdf_date=new SimpleDateFormat("yyyy-MM-dd");
	long a=(end.getTimeInMillis()-beg.getTimeInMillis())/24/60/60/1000;
	try {
	   for(int i=0;i<=a;i++){
		list.add(sdf_date.format(sdf_date.parse(beg.get(Calendar.YEAR)+"-"+(beg.get(Calendar.MONTH)+1)+"-"+beg.get(Calendar.DATE))));
	    beg.add(Calendar.DATE, 1);
	   }
	   return list;
    } catch (ParseException e) {
		e.printStackTrace();
	}
	return null;
	}
	
	/**
	 * 根据参数datetime,获取datetime的【上月】开始时间-结束时间
	 */
	public static Date[] lastMonthStartEndTime(Date datetime){
		Date[] results=new Date[2];
        Calendar   cal_1=Calendar.getInstance();//获取当前日期 
        cal_1.setTime(datetime);
        cal_1.add(Calendar.MONTH, -1);//上月
        cal_1.set(Calendar.DAY_OF_MONTH,cal_1.getActualMinimum(Calendar.DAY_OF_MONTH));
        cal_1.set(Calendar.HOUR_OF_DAY, 0);
        cal_1.set(Calendar.MINUTE, 0);
        cal_1.set(Calendar.SECOND, 0);
        results[0]=cal_1.getTime();
        
        cal_1.set(Calendar.DAY_OF_MONTH, cal_1.getActualMaximum(Calendar.DAY_OF_MONTH));  
        cal_1.set(Calendar.HOUR_OF_DAY, 23);
        cal_1.set(Calendar.MINUTE, 59);
        cal_1.set(Calendar.SECOND, 59);
        results[1]=cal_1.getTime();
        return results;
	}
	
	/**
	 * 根据参数datetime,获取datetime的【上周】开始时间-结束时间
	 * @return results[0]:开始时间 results[1]:结束时间
	 */
	public static Date[] lastWeekStartEndTime(Date datetime){
		Date[] results=new Date[2];
    Calendar   cal=Calendar.getInstance();
    cal.setTime(datetime);
    // 本周开始时间
	cal.setFirstDayOfWeek(Calendar.MONDAY);
	cal.set(Calendar.HOUR_OF_DAY, 0);
	cal.set(Calendar.MINUTE, 0);
	cal.set(Calendar.SECOND, 0);
	cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
   // System.out.println("本周开始时间:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime()));
	
    cal.add(Calendar.DATE, -1);//上周时间
	cal.setFirstDayOfWeek(Calendar.MONDAY);
	cal.set(Calendar.HOUR_OF_DAY, 0);
	cal.set(Calendar.MINUTE, 0);
	cal.set(Calendar.SECOND, 0);
	cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
	//System.out.println("上周开始时间:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime()));
	results[0]=cal.getTime();
	
    cal.setFirstDayOfWeek(Calendar.MONDAY);
    cal.set(Calendar.HOUR_OF_DAY, 23);
    cal.set(Calendar.MINUTE, 59);
    cal.set(Calendar.SECOND, 59);
    cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
    
    results[1]=cal.getTime();
    
    return results;
    }
}
