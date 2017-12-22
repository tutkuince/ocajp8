package com.oracle.javacert.associate.chapter03._04arrays;

import java.util.Arrays;

public class Searching {
	/** Main method */
	public static void main(String[] args) {
		int[] numbers1 = { 2, 4, 6, 8, 10 };
		System.out.println(Arrays.binarySearch(numbers1, 2)); // 0
		System.out.println(Arrays.binarySearch(numbers1, 4)); // 1
		System.out.println(Arrays.binarySearch(numbers1, 1)); // -1
		System.out.println(Arrays.binarySearch(numbers1, 3)); // -2
		System.out.println(Arrays.binarySearch(numbers1, 9)); // -5

		System.out.println("-----------------");

		int[] numbers2 = { 3, 2, 1 };	// numbers2 must be sort firstly
		System.out.println(Arrays.binarySearch(numbers2, 2));	//result is not predictable
		System.out.println(Arrays.binarySearch(numbers2, 3));	//result is not predictable
	}
}
