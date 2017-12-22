package com.oracle.javacert.associate.chapter03._01creatingmanipulatingstrings;

/**
 * @author tutku
 * 
 * If both operands are numeric, + means numeric addition
 * If either operand is a String, + means concatenation
 * The expression is evaluated left to right
 * */

public class Concatenation {
	/** Main method */
	public static void main(String[] args) {
		System.out.println(1 + 2);
		System.out.println("a" + "b");
		System.out.println("a" + "b" + 3);
		System.out.println(1 + 2 + "c");
		
		System.out.println("-------------------");
		
		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four);	//64
		
		System.out.println("-------------------");
		
		String lang = "Java";
		lang += " is everywhere!";
		String initializedToNull = null;
		initializedToNull += "Java";
		System.out.println("lang : " + lang);
		System.out.println("initializedToNull : " + initializedToNull);
		
		System.out.println("-------------------");
		
		String s = "1";
		s += "2";
		s += "3";
		s += 4;
		System.out.println("s : " + s);
	}
}
