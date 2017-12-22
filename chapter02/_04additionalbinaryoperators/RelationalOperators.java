package com.oracle.javacert.associate.chapter02._04additionalbinaryoperators;

public class RelationalOperators {
	public static void main(String[] args) {
		int x = 10, y = 20, z = 10;
		System.out.println("x is " + x + "-- y is " + y + "-- z is " + z);
		System.out.println("x < y : " + (x < y));
		System.out.println("x <= y : " + (x <= y));
		System.out.println("x >= z : " + (x >= z));
		System.out.println("x > z : " + (x > z));
		
		System.out.println("----------------");
		
		int a = 10;
		int b = 20;
		System.out.println("a is equal to b " + (a == b));
		System.out.println("a is not equal to b " + (a != b));
		
		
		/*
		 * int a = 5;
		 * boolean b1 = true;
		 * System.out.println(a == b); // DOES NOT COMPILE	*Incomparable types: int and boolean
		 * */
	}
}
