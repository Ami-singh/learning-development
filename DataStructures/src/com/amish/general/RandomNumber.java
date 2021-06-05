package com.amish.general;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long r = ThreadLocalRandom.current().nextLong(10000);
		UUID UID = new UUID(1,2);
        System.out.println(UID.randomUUID());
        
        AtomicInteger atom = new AtomicInteger();
        System.err.println(atom.getAndIncrement());
        System.err.println("------------------");
        
        System.err.println(generateNonce());

	}
	 public  static String generateNonce() {
		 final String aplhaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		 int count = 32;
		StringBuilder builder = new StringBuilder();
		builder.append(12345).append("_").append(67890).append("_").append(new Date().getTime()).append("_");
		while (count-- != 0) {
			int character = (int) (Math.random() * aplhaNumericString
					.length());
			System.err.println("character======"+character);
			builder.append(aplhaNumericString.charAt(character));
		}

		return builder.toString();

	 }

}
