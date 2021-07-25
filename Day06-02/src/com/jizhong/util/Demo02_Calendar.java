package com.jizhong.util;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Calendar：日历类(抽象类)
 * 	Calendar.getInstance()：可以获取Calendar的实体对象
 *
 */
public class Demo02_Calendar {
	public static void main(String[] args) throws ParseException {
		//通过getInstance()实例化的日历对象，默认为当前日期时间。
		Calendar c = Calendar.getInstance();
		Date d= c.getTime();
//		System.out.println(c.getTime());//当前日期时间
//		System.out.println(d);
		//Calendar.YEAR：获取日历中的年份
		int year = c.get(Calendar.YEAR);
		//Calendar.MONTH：获取日历对象月份
		int month = c.get(Calendar.MONTH) + 1; //0-11 1-12
		//Calendar.DAY_OF_MONTH：在当前月中是第几日
		int day = c.get(Calendar.DAY_OF_MONTH);
		//Calendar.HOUR_OF_DAY：获取日历对象当天时间 24
		int hour = c.get(Calendar.HOUR_OF_DAY);//24
		//Calendar.MINUTE：获取分钟
		int minute = c.get(Calendar.MINUTE);
		//Calendar.SECOND：获取秒钟
		int second = c.get(Calendar.SECOND);
		System.out.println(year + "年" + month + "月" + day + " " + hour + ":" + minute + ":" + second);
		
		//日期转换类:DateFormat
		//SimpleDateFormat(日期格式)：
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");//2021年06月02日
		//format(date)：将日期转换为指定格式字符串
		String dateStr = df.format(c.getTime());
		System.out.println("DateFormat转换后：" + dateStr);
		
		//parse(日期格式字符串)：将日期格式字符串转换为Date日期对象
		String parseDate = "2021-07-21";
		Date d2 = df.parse(parseDate);
		System.out.println(d2);
		//setTime(Date)：将日期对象传入日历对象，从而更简单的操作日期对象中的日期时间
		c.setTime(d2);//Calendar "2021-07-21"
		//Calendar.add(年|月|日,添加数量):在原本的日期上添加年月日时分秒
		//	参数2：如果是正数，表示加    如果是负数，表示减
		//field
		//2021-07-21";
		c.add(Calendar.YEAR, -10);
		System.out.println(c.getTime());
		
		
		/**
		 * Calendar类中常用方法：
		 * 	get(int field)：获取年月日时分秒的单个值
		 *  setTime(Date date)：将日期时间对象传递给Calendar日历对象，通过日历对象操作时间
		 *  getTime()：将日历对象的日期时间转换给Date对象
		 *  add(int field,整数)：在当前日历对象时间的基础上再添加时间
		 *  getTimeInMillis()：获取当前日期到1997年1月1日毫秒值
		 *  
		 *  field：Calendar类的静态成员变量
		 *  	Calendar.YEAR：年份
		 *  	Calendar.MONTH：月份
		 *  	Calendar.DAY_OF_MONTH：月中的日
		 *  	Calendar.HOUR_OF_DAY：日中的小时
		 * 		Calendar.MINUTE：分钟
		 * 		Calendar.SECOND：秒钟
		 * 		Calendar.DAY_OF_WEEK：星期
		 */
		
		/**
		 * Date类：一般用作存储日期时间
		 */
		
		/**
		 * DateFormat：日期格式化类
		 * 构造方法：
		 * 	SimpleDateFormat (日期格式字符串)：
		 * 		format和parse方法需要根据“日期格式字符串”来进行互相转换
		 * 
		 * 常用方法：
		 * 	format(Date date)：把日期对象转换为指定格式的日期字符串
		 *  parse(String date)：将日期格式的字符串转换为日期对象
		 */
		
		//获取日期 设置日期
		
		
	}
}
