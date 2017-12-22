package com.oracle.javacert.associate.chapter02._05javastatements;

public class ForStatement {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i >= 9) {
				System.out.println(i);
			} else {
				System.out.print(i + ",");
			}
		}
		
		/*
		for(;;){
			System.out.println("Hello World");			// Infinite loop
		}
		*/
		
		int x = 0;
		for(long y = 11, z = 4; x < 5 && y > 10; x++, y++){
			System.out.print(y + " ");
			
		}
		System.out.println("\nx is " + x);
		
		/*
		int x = 0;
		for(long y = 11, x = 4; x < 5 && y > 10; x++, y++){ 	// DOES NOT COMPILE 
			System.out.print(y + " ");
		}*/
		
		/*
		for(long y = 11, int x = 4; x < 5 && y > 10; x++, y++){	// DOES NOT COMPILE
			System.out.print(y + " ");
		}
		*/
	}
}
