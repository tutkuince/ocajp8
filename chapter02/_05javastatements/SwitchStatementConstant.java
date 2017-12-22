package com.oracle.javacert.associate.chapter02._05javastatements;

public class SwitchStatementConstant {
	public static void main(String[] args) {
		/*
		int dayOfWeek = 5;
		switch (dayOfWeek) {
		case 0:
			System.out.println("Sunday");
		default:
			System.out.println("Weekday");
		case 6:
			System.out.println("Saturday");		//OUTPUT : Weekday Saturday
			break;
		}
		 */
		
		int dayOfWeek = 5;
		switch (dayOfWeek) {
		case 5: 
			System.out.println("Friday");
		default:
			System.out.println("Weekday");
		case 0:
			System.out.println("Sunday");
		case 6:
			System.out.println("Saturday");
			break;
		}
	}
}
