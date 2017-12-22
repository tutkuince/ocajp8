package com.oracle.javacert.associate.chapter03._05arraylist;

import java.util.ArrayList;

public class AddMethod {
	/** Main method */
	public static void main(String[] args) {
		ArrayList<String> numbers = new ArrayList<>();
		numbers.add("one");
		numbers.add("two");
		numbers.add("four");
		numbers.add(2, "three");
		// list.add(Boolean.TRUE);	// DOES NOT COMPILE
		numbers.add(Boolean.TRUE.toString());
		System.out.println(numbers);
		
		System.out.println("---------------");
		ArrayList<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add(1, "robin");
		birds.add(0, "blue jay");
		birds.add(1, "cardinal");
		System.out.println(birds);
	}
}
