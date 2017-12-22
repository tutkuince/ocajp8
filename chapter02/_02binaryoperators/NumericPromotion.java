package com.oracle.javacert.associate.chapter02._02binaryoperators;

public class NumericPromotion {
	public static void main(String[] args) {
		int x = 1;
		long y = 33;
		System.out.println(x * y); // Data type of x * y is long
		
		double a = 32.21;
		float b = 2.1F;
		System.out.println(a * b); // Data type of a * b is double
		
		short s1 = 20;
		short s2 = 10;
		System.out.println(s1 / s2); // Data type of s1 / s2 is short
		
		short s = 14;
		float f = 13;
		double d = 30;
		System.out.println(s * f / d); // Data type of s * f / d is double
		
		byte b1 = 10;
		byte b2 = 20;
		int result = b1 + b2;
		System.out.println(result);
	}
}
