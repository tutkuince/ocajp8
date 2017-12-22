package com.oracle.javacert.associate.chapter03._04arrays;

public class UsingArrays {
	/** Main method */
	public static void main(String[] args) {
		String[] mammals = { "monkey", "chimp", "donkey" };
		System.out.println("mammals length : " + mammals.length);
		System.out.println(mammals[0]);
		System.out.println(mammals[1]);
		System.out.println(mammals[2]);
		
		System.out.println("---------------");
		
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 5;
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		// System.out.println(numbers[10]);	// ArrayIndexOutOfBoundException
	}
}
