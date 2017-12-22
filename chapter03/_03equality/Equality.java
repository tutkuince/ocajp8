package com.oracle.javacert.associate.chapter03._03equality;

/**
 * @author tutku ince
 * 
 * <b>equals()</b> on two StringBuilder instances, it will check refrence equality
 * */

public class Equality {
	/** Main method */
	public static void main(String[] args) {
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println("one == two " + (one == two));		// different references
		System.out.println("one == three " + (one == three));	// both point to the same object
		
		System.out.println("-----------------");
		
		String x = "Hello World";
		String y = "Hello World";
		System.out.println("x == y " + (x == y));				// point to the same location in memory (string pool)
		
		System.out.println("-----------------");
		
		String s1 = "Hello World";
		String s2 = " Hello World".trim();
		System.out.println("s1 == s2 " + (s1 == s2));			// not in same location in memory
		System.out.println("s1.equals(s2) " + s1.equals(s2));	// same words and same sequence of char
		
		System.out.println("-----------------");
		
		String s3 = new String("Hello World");
		String s4 = "Hello World";
		System.out.println("s3 == s4 " + (s3 == s4));
		System.out.println("s3.equals(s4) " + s3.equals(s4));
		
		System.out.println("-----------------");
		Equality e1 = new Equality();
		Equality e2 = new Equality();
		Equality e3 = e1;
		System.out.println("e1 == e2 " + (e1 == e2));
		System.out.println("e1 == e3 " + (e1 == e3));
		System.out.println("e1.equals(e2) " + e1.equals(e2));
		System.out.println("e1.equals(e3) " + e1.equals(e3));
	}
}
