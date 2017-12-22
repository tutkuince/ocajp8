package com.oracle.javacert.associate.chapter02._03unaryoperators;

public class LogicalComplement {
	public static void main(String[] args) {
		boolean x = false;
		System.out.println("x : " + x);
		x = !x;	//flips the value of a boolean expression
		System.out.println("x : " + x);
		
		double d = 1.2D;
		System.out.println("d : " + d);
		d = -d;	//reverses the sign of a numeric expression
		System.out.println("d : " + d);
		d = -d;	// reverses the sign of a numeric expression 
		System.out.println("d : " + d);
		
		
		/*
		 * These are don't compile
		 * int x = !5;
		 * boolean y = -true;
		 * boolean z = !0;
		 * */
		
	}
}
