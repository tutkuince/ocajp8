package com.oracle.javacert.associate.chapter03._02stringbuilderclass;

/**
 * @author tutku
 * 
 * <b>append()</b> adds the parameter to the StringBuilder and a returns a reference to the current StringBuilder.
 * */

public class AppendMethod {
	/** Main method */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder().append(1).append('c');
		sb.append("-").append(true);	// does not need to convert parameter to a String
		System.out.println(sb);
		
		System.out.println("-------------------");
		
		char[] ch = { 'J', 'A', 'V', 'A', '8' };
		StringBuilder s = new StringBuilder();
		s.append(ch, 1, 3);
		System.out.println("s : " + s);
	}
}
