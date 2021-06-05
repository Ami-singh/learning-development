package com.amish.general;

//Java Program to convert 
//byte array to file 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter; 

public class ByteFileWrite { 

	// Path of a file 
	static String FILEPATH = "C:\\Users\\amishkumar.singh\\Desktop\\NoName.pdf"; 
	static File file = new File(FILEPATH); 

	// Method which write the bytes into a file 
	static void writeByte(byte[] bytes) 
	{ 
		try { 

			// Initialize a pointer 
			// in file using OutputStream 
			OutputStream 
				os 
				= new FileOutputStream(file); 

			// Starts writing the bytes in it 
			os.write(bytes); 
			System.out.println("Successfully"
							+ " byte inserted"); 

			// Close the file 
			os.close(); 
		} 

		catch (Exception e) { 
			System.out.println("Exception: " + e); 
		} 
	} 

	public static void copy() throws IOException
    {
		InputStream input = new FileInputStream("C:\\Users\\amishkumar.singh\\Desktop\\LS2440021841.pdf"); 
		OutputStream os = new FileOutputStream(file); 
        byte buffer[] = new byte[4096];
        int n = input.read(buffer);
        while (n != -1)
        {
        	os.write(buffer, 0, n);
            n = input.read(buffer);
        }
        
        System.out.println("Successful");

    }
	
	private static void generatePDFFromImage() throws DocumentException, MalformedURLException, IOException {
		String filename = "C:\\Users\\amishkumar.singh\\Desktop\\LS2440021841.jpg";
	    Document document = new Document();
	    String input = filename;
	    String output = "C:\\Users\\amishkumar.singh\\Desktop\\LS2440021841.pdf";
	    FileOutputStream fos = new FileOutputStream(output);
	 
	    PdfWriter writer = PdfWriter.getInstance(document, fos);
	    writer.open();
	    document.open();
	    document.add(Image.getInstance(input));
	    document.close();
	    writer.close();
	    System.out.println("successfull");
	}
	// Driver Code 
	public static void main(String args[]) throws IOException, DocumentException 
	{ 

		String string = "GeeksForGeeks"
						+ " - A Computer Science"
						+ " Portal for geeks"; 

		// Get byte array from string 
		byte[] bytes = string.getBytes(); 

		// Convert byte array to file 
		
		//writeByte(bytes); 
		//copy();
		generatePDFFromImage();
	} 
} 

