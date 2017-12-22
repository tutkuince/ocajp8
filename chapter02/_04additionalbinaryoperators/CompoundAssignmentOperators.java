package com.oracle.javacert.associate.chapter02._04additionalbinaryoperators;

public class CompoundAssignmentOperators {
	public static void main(String[] args) {
		int x = 2, z = 3;
		x = x * z;	// Simple assignment operator
		x *= z;		// Compound assignment operator
		
		long l = 10;
		int i = 5;
		// i = i * l; DOES NOT COMPILE
		i *= l;	//compiler will automatically cast the resulting value to the data type of the value on the left-hand side
		System.out.println("int i is " + i);
		
		long l1 = 5;
		long l2 = (l1 = 3);
		System.out.println("long l1 is " + l1);
		System.out.println("long l2 is " + l2);
		
		int a = 7, b = 10, c = 8;
		a = b = c;
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println("c is " + c);
	}
}
