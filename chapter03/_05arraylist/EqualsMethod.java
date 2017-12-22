package com.oracle.javacert.associate.chapter03._05arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tutku
 * 
 *         <b>equals()</b> compare two lists to see if they contain the same
 *         elements in the same order not like arrays
 */

public class EqualsMethod {
	public static void main(String[] args) {
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		System.out.println(one.equals(two));	// contains same elements so true
		one.add("a");
		System.out.println(one.equals(two));	// contains different elements so false
		two.add("a");
		System.out.println(one.equals(two));	// contains same elements so true
		one.add("b");
		two.add(0, "b");
		System.out.println(one.equals(two));	// contains different elements so false
		System.out.println("one " + one);
		System.out.println("two " + two);

		System.out.println("------------");
		String[] a1 = { "1", "2", "3" };
		String[] a2 = { "1", "2", "3" };
		String[] a3 = a1;
		System.out.println(a1.equals(a2));		// different reference so false
		System.out.println(a1.equals(a3));		// same reference so true
	}
}
