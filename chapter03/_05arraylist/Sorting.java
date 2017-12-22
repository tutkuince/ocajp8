package com.oracle.javacert.associate.chapter03._05arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(99);
		numbers.add(5);
		numbers.add(81);
		System.out.println(numbers);
		System.out.println("- - - After Sorting - - -");
		Collections.sort(numbers); // ArrayList can be sort with "Collections.sort(numbers)"
		System.out.println(numbers);

	}
}
