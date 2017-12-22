package com.oracle.javacert.associate.chapter02._04additionalbinaryoperators;

public class AssignmentOperators {
	public static void main(String[] args) {
		int x = 1; //assigns x the value of 1.
		System.out.println("x is " + x);
		
		/*
		 * These are don't compile
		 * int x = 1.0;
		 * short y = 1921222;
		 * int z = 9f;
		 * long t = 12312321312312313;
		 * */
		x += 5; // it means x = x + 5;
		x -= 5; // it means x = x - 5;
		x *= 5; // it means x = x * 5;
		x /= 5; // it means x = x / 5;
		x %= 5; // it means x = x % 5;
	}
}
