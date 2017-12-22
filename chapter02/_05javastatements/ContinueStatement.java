package com.oracle.javacert.associate.chapter02._05javastatements;

public class ContinueStatement {
	public static void main(String[] args) {
		
		
		FIRST_CHAR_LOOP: for (int i = 1; i <= 4; i++) {
			for (char x = 'a'; x <= 'c'; x++) {
				if (i == 2 || x == 'b') {
					continue FIRST_CHAR_LOOP;
				}
				System.out.print(" " + i + x);
			}
		}
	}
}
