package com.oracle.javacert.associate.chapter02._04additionalbinaryoperators;

/**
 * @author tutku ince
 * 
 * <b> Short-circuit operators </b> are used is checking for null objects before performing an operation
 * */

public class LogicalOperators {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a = " + a + "; b = " + b + ";");
		System.out.println("a > 20 && b > 10 : " + (a > 20 && b > 10));
		System.out.println("a > 20 || b > 10 : " + (a > 20 || b > 10));
		System.out.println("!(b > 10) : " + !(b > 10));
		System.out.println("!(a > 20) : " + !(a > 20));
		
		System.out.println("----------------------------");
		
		int x = 6;
		boolean y = (x >= 6) || (++x <= 7);		// || => if left-hand side is true does not need to check right-hand side
		System.out.println("int x is " + x);
		System.out.println("boolean y is " + y);
		
		System.out.println("----------------------------");
		
		int i = 6;
		boolean b1 = (i >= 6) | (++i <= 7);		// |  => if left-hand side is true i check right-hand side too
		System.out.println("int i is " + i);
		System.out.println("boolean b1 is " + b1);
	}
}
