package com.amish.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(20);
		l.add(5);
		l.add(40);
		l.add(30);
		
		String fileName = "d://lines.txt";
		String find = "Singh";
		//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			ArrayList<Integer> len = new ArrayList<>();
			Consumer<String> c = s->{
				len.add(s.length());
			};
			stream.forEach(c);
			Integer max = len.stream().max((i1,i2)->i1.compareTo(i2)).get();
			System.out.println(max);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(l);
		List<Integer> list = l.stream().filter(i->i%2 == 0).collect(Collectors.toList());
		System.out.println(list);
		List<Integer> map = l.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(map);
		List<Integer> sorted = l.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		List<Integer> sort = l.stream().sorted((i1,i2)->(i1<i2)?1:((i1>i2)?-1:0)).collect(Collectors.toList());
		System.out.println(sort);
		List<Integer> customsort = l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(customsort);
		
	}

}
