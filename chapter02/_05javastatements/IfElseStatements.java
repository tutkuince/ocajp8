package com.oracle.javacert.associate.chapter02._05javastatements;

import java.util.Scanner;

public class IfElseStatements {
	public static void main(String[] args) {
		// Create scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		String result = "";
		System.out.print("Enter your grade : ");
		int grade = input.nextInt();
		
		if(grade <= 20){
			result = "Awful";
		}else if(grade <= 40){
			result = "Bad";
		}else if(grade <= 60){
			result = "Not Bad";
		}else if(grade <= 80){
			result = "Good";
		}else {
			result = "Excellent";
		}
		
		System.out.println("Your result is : " + result);
		
		/*
		 * int i = 5;
		 * if(i)					// DOES NOT COMPILE
		 * 	System.out.println(i);
		 * */
	}
}
