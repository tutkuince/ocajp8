package com.oracle.javacert.associate.chapter02._01javaoperators;

public class Operators {
	public static void main(String[] args) {
		int y = 4;
		double x = 3 + 2 * --y;
		System.out.println(x);
		
		x++;	//post-unary operators
		++x;	//pre-unary operators
	}
}
