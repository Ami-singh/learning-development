package com.amish.java8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		readLinesUsingFileReader();
	}
	
	private static void readLinesUsingFileReader() throws IOException
	{
	    File file = new File("d://lines.txt");
	 
	    FileReader fr = new FileReader(file);
	    BufferedReader br = new BufferedReader(fr);
	    int i = 0;
	    String line;
	    while((line = br.readLine()) != null)
	    {
	    	int len = line.length();
	        if(len>i){
	            i=len;
	        }
	    }
	    System.out.println(i);
	    br.close();
	    fr.close();
	}

}
