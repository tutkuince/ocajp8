package com.oracle.javacert.associate.chapter03._01creatingmanipulatingstrings;

/**
 * @author tutku
 * 
 *         <b>substring()</b> returns parts of the string
 */

public class SubstringMethod {
	/** Main method */
	public static void main(String[] args) {
		String str = "animals";
		System.out.println(str.substring(3)); 					// mals
		System.out.println(str.substring(str.indexOf('m'))); 	// mals
		System.out.println(str.substring(3, 4)); 				// m
		System.out.println(str.substring(3, 7)); 				// mals
		
		// System.out.println(str.substring(3, 8));				// Throws an exception (index out of range)
		// System.out.println(str.substring(3, 3));				// empty string
		// System.out.println(str.substring(3, 2));				// throws exception
	}
}
