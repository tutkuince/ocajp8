package com.oracle.javacert.associate.chapter02._05javastatements;

public class TernaryOperator {
	public static void main(String[] args) {
		System.out.println("--------------IF STATEMENT-----------");
		int y = 10;
		int x;
		if (y > 5) {
			x = 2 * y;
		} else {
			x = 3 * y;
		}
		System.out.println("x is " + x);
		System.out.println();

		System.out.println("--------TERNARY OPERATOR--------");
		int a = 10;
		int b = (a > 5) ? (2 * a) : (3 * a);
		System.out.println("b is " + b);

		System.out.println("----------");
		System.out.println((y > 5) ? 21 : "Tutku");
		// int name = (y > 5) ? 9 : "Tutku"; // DOES NOT COMPILE

		System.out.println("------------");
		
		int i1 = 1;
		int i2 = 1;
		int i = i1 < 10 ? i1++ : i2++;
		System.out.println("i1 : " + i1 + ", i2 : " + i2);
		System.out.println("i is " + i);
	}
}
