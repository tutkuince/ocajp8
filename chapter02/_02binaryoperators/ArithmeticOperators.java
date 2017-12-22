package com.oracle.javacert.associate.chapter02._02binaryoperators;

public class ArithmeticOperators {
	public static void main(String[] args) {
		int x = 2 * 5 + 3 * 4 - 8;
		System.out.println("Result is for x" + x);
		
		int y = 2 * ((5 + 3) * 8);
		System.out.println("Result is for y " + y);
		
		System.out.println("---------------------");
		
		System.out.println("Result for (9 / 3) " + 9 / 3);
		System.out.println("Result for (9 % 3) " + 9 % 3);
		
		char char1 = 'a';
		System.out.println("Result for (char1 + char1) " + (char1 + char1));
		System.out.println("Result for (char1 - char1) " + (char1 - char1));
	}
}
