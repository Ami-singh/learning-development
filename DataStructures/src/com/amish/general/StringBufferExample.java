package com.amish.general;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StringBufferExample {

	public static void main(String[] args) throws IOException {

		StringBuffer allURLStatus = new StringBuffer();
		allURLStatus.append("Success Downloads:");
		allURLStatus.append(System.getProperty("line.separator"));
		allURLStatus.append("0212629999-Invoice_0035004387");
		allURLStatus.append(System.getProperty("line.separator"));
		allURLStatus.append("0212629999-Invoice_0035004387");
		System.err.println(allURLStatus);
		BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("d:/demo.txt")));
		
		//write contents of StringBuffer to a file
		bwr.write(allURLStatus.toString());
		bwr.flush();
		bwr.close();
	}

}
