package com.oracle.javacert.associate.chapter03._04arrays;

import java.util.Arrays;

public class Sorting {
	/** Main method */
	public static void main(String[] args) {
		int[] numbers = { 6, 9, 1, 3, 0 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\nAFTER SORTING");
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		System.out.println("\n---------------------");

		String[] strNums = { "10", "9", "100", "1A", "8A" };
		for (int i = 0; i < strNums.length; i++) {
			System.out.print(strNums[i] + " ");
		}
		System.out.println("\nAFTER SORTING");
		Arrays.sort(strNums);
		for (int i = 0; i < strNums.length; i++) {
			System.out.print(strNums[i] + " ");
		}
	}
}
