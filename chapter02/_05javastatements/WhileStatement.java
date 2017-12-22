package com.oracle.javacert.associate.chapter02._05javastatements;

public class WhileStatement {
	public static void main(String[] args) {
		int num = 9;
		boolean divisibleBy7 = false;
		while(!divisibleBy7){
			System.out.println(num);
			if(num % 7 == 0){
				divisibleBy7 = true;
			}
			num--;
		}
		/*
		int x = 2;
		int y = 5;
		while(x < 10){
			y++;
		}			// Infinite loop
		*/
	}
}
