package com.oracle.javacert.associate.chapter03._01creatingmanipulatingstrings;

/**
 * <b>replace()</b> does a simple search and replace on the string
 * */

public class ReplaceMethod {
	/** Main method */
	public static void main(String[] args) {
		String str = "animals";
		System.out.println(str.replace('a', '4'));
		System.out.println(str.replace("i", "1"));
		
		
		// System.out.println(str.replace('a', "4"));	// Does not compile
		// System.out.println(str.replace("i", '1'));	// Does not compile
	}
}
