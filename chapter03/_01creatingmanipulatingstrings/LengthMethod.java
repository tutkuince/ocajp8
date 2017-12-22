package com.oracle.javacert.associate.chapter03._01creatingmanipulatingstrings;

/** 
 * @author tutku
 * 
 * <b>length()</b> returns the number of characters in the String
 * */

public class LengthMethod {
	/** Main method */
	public static void main(String[] args) {
		String string = "animals";
		int length = string.length();
		System.out.println("The length of string is " + length);
		
		System.out.println("-------------------");
		
		System.out.println("The length of 'Tutku' is " + "Tutku".length());
	}
}
