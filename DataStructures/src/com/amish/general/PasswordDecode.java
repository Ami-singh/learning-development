package com.amish.general;

import java.util.Base64;

public class PasswordDecode {

	public static void main(String[] args)
	{
		String pass = "1@t1Ky93774im4%3";//1@t1Ky93774im4%3
		
		byte[] decodBytes = Base64.getDecoder().decode(pass);
		//Base64.getMimeDecoder()
		String decodUrl = new String(decodBytes);
		System.out.println(decodUrl);
		
		byte[] decodedBytes = Base64.getDecoder().decode(pass);
		//Base64.getMimeDecoder()
		String decodedUrl = new String(decodedBytes);
		System.out.println(decodedUrl);
		
	}
	
	
}
