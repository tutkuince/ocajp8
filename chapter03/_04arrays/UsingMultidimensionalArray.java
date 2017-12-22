package com.oracle.javacert.associate.chapter03._04arrays;

public class UsingMultidimensionalArray {
	/** Main method */
	public static void main(String[] args) {
		int[][] twoD = new int[3][2];
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {
				System.out.print(twoD[i][j] + " "); // print element
			}
			System.out.println(); // time for a new row
		}
		System.out.println("----------------");
		
		for (int[] two : twoD) {
			for (int i : two) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
