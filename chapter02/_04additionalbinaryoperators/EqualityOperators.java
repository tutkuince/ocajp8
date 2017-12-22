package com.oracle.javacert.associate.chapter02._04additionalbinaryoperators;

/**
 * @author tutku ince
 * 
 * Comparing two numeric primitive types
 * Comparing two boolean values
 * Comparing two objects, including null and String values
 * */

public class EqualityOperators {
	public static void main(String[] args) {
		/*
		 * boolean x = true = 3 			// DOES NOT COMPILE
		 * boolean y = false != "Tutku"; 	// DOES NOT COMPILE
		 * boolean z = 3 == "Izmir";		// DOES NOT COMPILE
		 */
		
		boolean y = false;
		System.out.println("boolean y is " + y);
		boolean x = (y = true);
		System.out.println("boolean x is " + x);
		System.out.println("boolean y is " + y);
		
		System.out.println("-----------------");
		
		String str1 = "Tutku";
		String str2 = "Tutku ";
		String str3 = str1;
		
		System.out.println("str1 == str2 is " + (str1 == str2));
		System.out.println("str1 == str3 is " + (str1 == str3));
	}
}
