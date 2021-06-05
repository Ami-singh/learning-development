package com.amish.general;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author Amishkumar.Singh
 * 
 */
public class StringRegex {
	public static void main(String[] args) {

        String patternstr = "^\\d{0,10}$";
        
        String text = "1234567890";

        Pattern pattern = Pattern.compile(patternstr);

        Matcher matcher = pattern.matcher(text);

        boolean matches = matcher.matches();

        System.out.println("matches = " + matches);
    }
}