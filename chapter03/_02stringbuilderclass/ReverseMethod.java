package com.oracle.javacert.associate.chapter03._02stringbuilderclass;

/**
 * @author tutku ince 
 * 
 * <b>reverse()</b> reverses the characters in the sequences
 * */

public class ReverseMethod {
	/** Main method */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("ABCDEFG");
		System.out.println("sb : " + sb);
		sb.reverse();
		System.out.println("sb : " + sb);
	}
}
