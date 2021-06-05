package com.amish.java8;

import java.util.ArrayList;

public class ArrayListListCollect {

	public static void main(String[] args) {
	
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		list1.addAll(list2);
		list1.stream().sorted().forEach(System.out::println);
		
	}

}
