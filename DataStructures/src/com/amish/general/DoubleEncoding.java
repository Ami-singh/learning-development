package com.amish.general;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class DoubleEncoding {
    public static void main(String[] args) throws Exception {
    	File file = new File("C:\\test\\test.txt"); 
    	  
    	  BufferedReader br = new BufferedReader(new FileReader(file)); 
    	  
    	  String st; 
    	  while ((st = br.readLine()) != null) 
    	    System.out.println(st); 
    	  
    	  String a = "送貨單";
    	  System.err.println(a);
    	  
    	  try {
    		  System.err.println(URLEncoder.encode("", "UTF-8"));
    	     }
    	     catch (UnsupportedEncodingException ex){
    	       throw new RuntimeException("UTF-8 not supported", ex);
    	     }
    }
}