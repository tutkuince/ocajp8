package com.oracle.javacert.associate.chapter06._03exceptiontypes;

public class Errors {
	static {
		int[] counts = new int[3];
		int num = counts[-1]; // ExceptionInInitializerError
		System.out.println(num);
	}

	public static void doNotCodeThis(int num) {
		doNotCodeThis(1); // StackOverflowError
	}

	// NoClassDefFoundError -> occurs when Java can't find the class at runtime
}
