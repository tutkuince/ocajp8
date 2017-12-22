package com.oracle.javacert.associate.chapter03._01creatingmanipulatingstrings;

/**
 * @author tutku
 * 
 * <b>indexOf()</b> looks at the characters in the string and finds the first index that matches the desired value
 * <b>indexOf()</b> of returns -1 when no match is found
 * */

public class IndexOfMethod {
	/** Main method */
	public static void main(String[] args) {
		String string = "animal";
		System.out.println(string.indexOf('a'));	// 0
		System.out.println(string.indexOf('a', 2));	// 4
		System.out.println(string.indexOf('A')); 	// indexOf() is case sensitive => -1
		System.out.println(string.indexOf("al"));	// 4
		System.out.println(string.indexOf('a',4));	// 4
		System.out.println(string.indexOf("al", 5));// The second parameter is fromIndex 
	}
}
