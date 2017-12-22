package com.oracle.javacert.associate.chapter03._01creatingmanipulatingstrings;

/**
 * @author tutku
 * 
 * <b>startsWith() and endsWith()</b> methods look at whether the provided value matches part of the String
 * */

public class StartsWithEndWithsMethod {
	/** Main method */
	public static void main(String[] args) {
		String str = "animal";
		System.out.println(str.startsWith("a"));
		System.out.println(str.startsWith("A"));	// Case sensitive
		System.out.println(str.startsWith("a", 4));	// start index is 4
		System.out.println(str.startsWith("an"));
		System.out.println(str.endsWith("l"));
		System.out.println(str.endsWith("L"));
		System.out.println(str.endsWith("mal"));
	}
}
