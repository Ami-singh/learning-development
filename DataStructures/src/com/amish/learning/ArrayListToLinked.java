package com.amish.learning;

import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

public class ArrayListToLinked
{
	// Generic function to construct a new LinkedList from ArrayList
	public static <T> List<T> getInstance(List<T> arrayList)
	{
		List<T> treeList = new LinkedList<>();
	
		for (T e: arrayList)
			treeList.add(e);
	
		return treeList;
	}

	// Program to convert ArrayList to LinkedList in Java
	public static void main(String args[])
	{
		List<String> arrayList = Arrays.asList("RED", "BLUE", "GREEN");

		// construct a new LinkedList from ArrayList
		List<String> treeList = getInstance(arrayList);
		System.out.println(treeList);
	}
}