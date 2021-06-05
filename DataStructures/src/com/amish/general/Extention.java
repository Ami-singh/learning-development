package com.amish.general;

import com.amish.java8.Left;
import com.amish.java8.Right;

public class Extention implements Left,Right{

	public static void main(String[] args) {
		Extention ex = new Extention();
		ex.m1();
		ex.m2();
	}

	@Override
	public void m1() {
		System.out.println("M1 Method");
		
	}

	@Override
	public void m2() {

		//Right.super.m2();
		
	}

}
