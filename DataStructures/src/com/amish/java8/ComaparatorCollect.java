package com.amish.java8;

import java.util.Arrays;
import java.util.List;

public class ComaparatorCollect {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Amish","Sandeep","Manju");
		
		list.stream().sorted((s1,s2)->-(s1.compareTo(s2))).forEach(System.out::println);
		// .filter(s->s.startsWith("A")).forEach(System.out::println)
	}

}
