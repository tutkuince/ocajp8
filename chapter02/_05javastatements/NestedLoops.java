package com.oracle.javacert.associate.chapter02._05javastatements;

public class NestedLoops {
	public static void main(String[] args) {
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		for (int[] mySipmleArray : myComplexArray) {
			for (int i = 0; i < mySipmleArray.length; i++) {
				System.out.print(mySipmleArray[i] + "\t");
			}
			System.out.println();
		}
	}
}
