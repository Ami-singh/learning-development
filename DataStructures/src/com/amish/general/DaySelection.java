package com.amish.general;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DaySelection {

	public static void main(String[] args) {
		 
        Date now = new Date();
 
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week abbreviated
        System.out.println(simpleDateformat.format(now));
 
        simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        System.out.println(simpleDateformat.format(now));
 
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // the day of the week in numerical format
        System.out.println("Hours:::: "+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("DAY OF THE MONTH:: "+calendar.get(Calendar.DAY_OF_MONTH));
    }
}
