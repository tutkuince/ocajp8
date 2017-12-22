package com.oracle.javacert.associate.chapter03._02stringbuilderclass;

/**
 * @author tutku ince
 * <b>delete()</b> is the opposite of the insert() method
 * */

public class DeleteAndDeleteCharAtMethods {
	/** Main method */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdef");
		sb.delete(1, 3);
		System.out.println("sb : " + sb);
		// sb.deleteCharAt(5);	// throws an exception (String index out of range)
		sb.deleteCharAt(0);
		System.out.println("sb : " + sb);
	}
}
