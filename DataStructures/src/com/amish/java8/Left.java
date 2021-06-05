package com.amish.java8;

public interface Left {
	
	public void m1();
	
	default void m2() {
		System.out.println("Interface default method Left");
	}
}
