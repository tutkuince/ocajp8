package com.oracle.javacert.associate.chapter02._05javastatements;

/**
 * @author tutku ince
 * Data type supported by switch: int, byte, short, char, String, enum and their wrapper class
 * */

public class SwitchStatement {
	public static void main(String[] args) {
		int marks = 20;
		switch (marks) {
		case 10:
			System.out.println("marks : " + 10);
			break;
		case 20:
			System.out.println("marks : " + 20);
			break;
		case 30:
			System.out.println("marks : " + 30);
			break;
		case 40:
			System.out.println("marks : " + 40);
			break;
		case 50:
			System.out.println("marks : " + 50);
			break;
		default:
			System.out.println("default");
			break;
		}
		
		/*
		 * boolean b = false;
			switch(b){			//BOOLEAN DOES NOT SUPPORTED BY SWITCH
		
		}
		 * */
				
	}
}
