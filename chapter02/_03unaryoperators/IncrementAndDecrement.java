package com.oracle.javacert.associate.chapter02._03unaryoperators;

public class IncrementAndDecrement {
	public static void main(String[] args) {
		int counter = 0;
		System.out.println("Counter : " + counter);		//0
		System.out.println("Counter : " + ++counter);	//1
		System.out.println("Counter : " + counter);		//1
		System.out.println("Counter : " + counter--);	//1
		System.out.println("Counter : " + counter);		//0
		
		int x = 3;
		int y = ++x * 5 / 4 + x-- + --x;
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		
		int a = 10;
		a = ++a + a + --a - --a + a++; // 11 + 11 + 10 - 9 + 9
		System.out.println("a is " + a);
	}
}
