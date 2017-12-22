package com.oracle.javacert.associate.chapter03._01creatingmanipulatingstrings;

/**
 * @author tutku
 * 
 * <b>trim()</b> removes whitespace from the beginning and end of a String ( \t , \n \r are included)
 * */

public class TrimMethod {
	/** Main method */
	public static void main(String[] args) {
		String str = "\n \t \r    a n i m a l s    ";
		System.out.println(str);
		System.out.println(str.trim());
	}
}
