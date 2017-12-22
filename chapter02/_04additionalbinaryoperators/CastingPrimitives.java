package com.oracle.javacert.associate.chapter02._04additionalbinaryoperators;

/**
 * @author tutku ince
 * 
 * Casting primitive values : Larger data type to smaller data type.
 * */

public class CastingPrimitives {
	public static void main(String[] args) {
		int x = (int)1.0;
		System.out.println("int x is " + x);
		
		short y = (short)1921222;
		System.out.println("short y is " + y);
		
		int z = (int)9L;
		System.out.println("int z is " + z);
		
		short a = 10;
		short b = 5;
		// short c = a / b; DOES NOT COMPILE
		short c = (short)(a / b);
		System.out.println("short c is " + c);
		// OR
		int d = a / b;
		System.out.println("int d is "+ d);
	}
}
