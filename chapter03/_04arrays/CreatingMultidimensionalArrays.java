package com.oracle.javacert.associate.chapter03._04arrays;

public class CreatingMultidimensionalArrays {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[][] numbers1; // 2D array
		int numbers2[][]; // 2D array
		int[] numbers3[]; // 2D array
		int numbers4[], numbers5[][]; // a 2D array and 3D array

		String[][] reactangle = new String[3][2];

		int[][] differentSize = { { 1, 4 }, { 3 }, { 9, 8, 7 } };
		
		int[][] nums = new int[4][];
		nums[0] = new int[5];
		nums[1] = new int[3];
	}
}
