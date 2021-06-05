package com.amish.learning;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ConvertDaysToWeeks {
	
	static final int DAYS_IN_WEEK = 5; 
	   
	 // Driver Code 
	 public static void main(String[] args) {
		 
		 long years = 0;
	        long weeks = 0;
	        long days = 0;

	    	String dateAfterString = "2021-05-03";
	    	String display = "";	
	    	//Parsing the date
	    	LocalDate from = LocalDate.now();
	    	LocalDate to = LocalDate.parse(dateAfterString);
	    		
	    	//calculating number of days in between
	    	long noOfDaysBetween = ChronoUnit.DAYS.between(from, to);
	    	long DAYS_IN_WEEK = 5; 	
	    	//displaying the number of days
	    	System.out.println(noOfDaysBetween);
	    	if (noOfDaysBetween>365)
	    		display = "Consult Factory";
	    	if(noOfDaysBetween>0 && noOfDaysBetween<5)
	    		weeks = 1;
	    	else{
	    		years = (noOfDaysBetween / 365);
		        weeks = (noOfDaysBetween % 365) / DAYS_IN_WEEK;
		        days  = (noOfDaysBetween % 365) % DAYS_IN_WEEK;
		        if(days>0 && days<DAYS_IN_WEEK){
		        	System.err.println("success");
		        	weeks = weeks+1;
		        }
	    	}

	        /* Print total years, weeks and remaining days in given days */
	        System.out.println("Year/s = " + years);
	        System.out.println("Week/s = " + weeks);
	        System.out.println("Day/s  = " + days);
	    	
	    }

}
