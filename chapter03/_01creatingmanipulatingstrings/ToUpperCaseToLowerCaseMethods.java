package com.oracle.javacert.associate.chapter03._01creatingmanipulatingstrings;

/**
 * @author tutku
 * 
 * <b>toUpperCase()</b> converts any lowercase characters to uppercase in the returned string
 * <b>toLowerCase()</b> converts any uppercase characters to lowercase in the returned string
 * */

public class ToUpperCaseToLowerCaseMethods {
	/** Main method */
	public static void main(String[] args) {
		String strLower = "animals";
		String strUpper = "ANIMALS";
		System.out.println(strLower + " => " + strLower.toUpperCase());
		System.out.println(strUpper + " => " + strUpper.toLowerCase());
	}
}
