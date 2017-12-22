package com.oracle.javacert.associate.chapter02._05javastatements;

/**
 * @author tutku ince
 * 
 * <b> do-while loop</b> guarantees that the statement or block will be executed at least once
 * */

public class DoWhileStatement {
	public static void main(String[] args) {
		int x = 0;
		do{
			x++;
		}while(false);
		System.out.println("x is " + x);
		
		x = 20;
		while(x > 10){				// Same statement with while
			x--;
		}
		
		x = 20;
		if(x > 10){
			do {
				x--;
			} while (x > 10);		// same statement with do-while
		}
	}
}
