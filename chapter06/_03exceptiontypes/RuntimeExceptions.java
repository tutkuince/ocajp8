package com.oracle.javacert.associate.chapter06._03exceptiontypes;

public class RuntimeExceptions {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		int answer = 11 / 0; // ArithmetircException
		System.out.println(answer);

		int[] counts = new int[3];
		System.out.println(counts[-1]); // ArrayIndexOutOfBoundsException

		String type = "str";
		Object obj = type;
		Integer i = (Integer) obj; // ClassCastException
		System.out.println(i);

		String name = null;
		System.out.println(name.length()); // NullPointerException

		int number = Integer.parseInt("abc"); // NumberFormatException
		System.out.println(number);
	}

	public static void setNumberEggs(int numberEggs) {
		if (numberEggs < 0) {
			throw new IllegalArgumentException("# eggs must not be negative"); // IllegalArgumentException
		}
	}
}
