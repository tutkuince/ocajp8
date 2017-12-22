package com.oracle.javacert.associate.chapter03._02stringbuilderclass;

/**
 * @author tutku ince
 * 
 * <b>toString()</b> converts a StringBuilder into a String
 * */

public class ToStringMethod {
	/** Main method */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdef");
		String str = sb.toString();
		System.out.println(str);
	}
}
