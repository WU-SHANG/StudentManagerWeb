package com.ischoolbar.programmer.util;
/**
 * 日期格式化
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtil {
	public static String getFormatDate(Date date,String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
}
