package com.amish.general;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.ss");
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.ss");

	        Date date = new Date();
	        System.out.println(sdf.format(date));

	        Calendar cal = Calendar.getInstance();
	        System.out.println(sdf.format(cal.getTime()));

	        LocalDateTime now = LocalDateTime.now();
	        System.out.println(dtf.format(now));

	        LocalDate localDate = LocalDate.now();
	        System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));
	        
	        getTimezoneBasedTime("Asia/Shanghai");
	}
	
	private static void getTimezoneBasedTime(String timezone){
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		df.setTimeZone(TimeZone.getTimeZone(timezone));
		
		Calendar cal = Calendar.getInstance();
		String datestr = df.format(d);
		System.out.println("Timezone based DateStr::" + datestr);
		try {
			DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			df.setTimeZone(TimeZone.getTimeZone(timezone));
			
			cal.setTime(df1.parse(datestr));
			System.out.println("Timezone based date::" + cal.getTime());
			System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // the day of the week in numerical format
	        System.out.println("Hours:::: "+cal.get(Calendar.HOUR_OF_DAY));
	        System.out.println("DAY OF THE MONTH:: "+cal.get(Calendar.DAY_OF_MONTH));
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
