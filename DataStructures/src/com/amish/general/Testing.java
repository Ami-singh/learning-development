package com.amish.general;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import com.amish.java8.Interf;

public class Testing {

	
	public static void main (String[] args)
	{
		String email  = "amish_singh@emerson.com_20151";
		boolean check = false;
		String emailRegex = "^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})_?(\\d+)?$";
		
		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			check = false;
		else{
		check = pat.matcher(email).matches();
		}
		System.err.println("check===="+check);
	}
}