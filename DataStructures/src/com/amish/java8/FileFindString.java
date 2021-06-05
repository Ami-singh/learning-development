package com.amish.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileFindString {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(20);
		l.add(5);
		l.add(40);
		l.add(30);
		
		String fileName = "d://lines.txt";
		String find = "Singh";
		
		//read file into stream
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			
			Consumer<String> c = s->{
				System.out.println(s.contains(find));
			};
			
			stream.forEach(c);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
