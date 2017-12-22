package com.oracle.javacert.associate.chapter03._06wrapperclasses;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
	public static void main(String[] args) {
		List<Double> weights = new ArrayList<>();
		weights.add(50.5);
		weights.add(new Double(60));
		System.out.println(weights);
		weights.remove(50.5);
		double first = weights.get(0);
		System.out.println("first : " + first);
		weights.add(null);
		System.out.println(weights);
		// double second = weights.get(1);	// NullPointerException
		
		System.out.println("-------------------");
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		System.out.println("numbers " + numbers);
		numbers.remove(1);					// request the element with index 1 removed.
		System.out.println("numbers " + numbers);
		numbers.add(2);
		System.out.println("numbers " + numbers);
		numbers.remove(new Integer(1));		// you must write numbers.remove(new Integer(1)) to force wrapper class use
		System.out.println("numbers " + numbers);
		
	}
}
