package com.amish.java8;

public class CheckInterface implements Interf{

	public static void main(String[] args) {
		CheckInterface c = new CheckInterface();
		c.m1();

	}

	@Override
	public void m1() {
		System.out.println("Test");
	}

}
