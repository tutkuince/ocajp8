package com.oracle.javacert.associate.chapter02._05javastatements;

public class BreakStatement {
	public static void main(String[] args) {
		int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 12, 7 } };
		int searcValue = 2;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP: for (int i = 0; i < myComplexArray.length; i++) {
			for (int j = 0; j < myComplexArray[i].length; j++) {
				if(myComplexArray[i][j] == searcValue){
					positionX = i;
					positionY = j;
					break PARENT_LOOP;
				}
			}
		}
		if(positionX == -1 || positionY == -1){
			System.out.println("Value " + searcValue + " is not found");
		}else{
			System.out.println("Value " + searcValue + " found at : " + "(" + positionX + "," + positionY + ")");
		}
	}
}
