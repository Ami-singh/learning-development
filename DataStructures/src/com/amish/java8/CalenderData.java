package com.amish.java8;

import java.util.Calendar;

public class CalenderData {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    int lastDate = calendar.getActualMaximum(Calendar.DATE);

    calendar.set(Calendar.DATE, lastDate);
    int lastDay = calendar.get(Calendar.DAY_OF_MONTH);

    System.out.println("Last Date: " + calendar.getTime());

    System.out.println("Last Day : " + lastDay);
  }
}

