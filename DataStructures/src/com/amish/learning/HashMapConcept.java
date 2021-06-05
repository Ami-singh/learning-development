package com.amish.learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*class Dog {

	String color;

	Dog(String c) {

	color = c;

	}

	public String toString(){

	return color + " dog";

	}

	}*/

class Dog {

	String color;

	Dog(String c) {

		color = c;

	}

	public boolean equals(Object o) {

		return ((Dog) o).color == this.color;

	}

	public int hashCode() {

		return color.length();

	}

	public String toString() {

		return color + " dog";

	}

}

public class HashMapConcept {

	public static void main(String[] args) {

		Map<Dog, Integer> hashMap = new HashMap<Dog, Integer>();

		Dog d1 = new Dog("red");

		Dog d2 = new Dog("black");

		Dog d3 = new Dog("white");

		Dog d4 = new Dog("white");

		hashMap.put(d1, 10);

		hashMap.put(d2, 15);

		hashMap.put(d3, 5);

		hashMap.put(d4, 20); 

		// print size

		System.out.println(hashMap.size());

		// loop HashMap

		for (Entry entry : hashMap.entrySet()) {

			System.out
					.println(entry.getKey().toString() + "::: " + entry.getKey().hashCode() + " - " + entry.getValue());

		}

	}
}
