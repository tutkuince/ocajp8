package com.oracle.javacert.associate.chapter03._01creatingmanipulatingstrings;

/**
 * @author tutku
 * 
 * <b>charAt()</b> to retrieve a character at a specified index of a String
 * */

public class CharAtMethod {
	/** Main method */
	public static void main(String[] args) {
		String name = "Tutku";
		System.out.println("First character of name is " + name.charAt(0));					// T
		System.out.println("Last character of name is " + name.charAt(name.length() - 1));	// u
		// System.out.println(name.charAt(name.length())); throws an exception
	}
}
