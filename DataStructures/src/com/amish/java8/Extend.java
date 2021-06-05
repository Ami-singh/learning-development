package com.amish.java8;

import com.amish.java8.Java8Tester.MathOperation;

public class Extend {

	 public static void main(String[] args)
	 {
		 MathOperation addition = (a, b) -> a + b;
		 System.out.println(addition.operation(10, 10));
	 }
}
