package com.oracle.javacert.associate.chapter06._01exceptions;

public class ThrowingException {
	public static void main(String[] args) throws Exception {
		String[] animals = new String[0];
		// System.out.println(animals[0]); // throws ArrayIndexOutOfBoundsException
		if (animals.length > 0) {
			System.out.println(animals[0]);
		} else {
			throw new Exception(); // throw exception
		}

	}
}
