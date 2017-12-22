package com.oracle.javacert.associate.chapter04._06constructors;

public class OrderOfInitializationPart3 {
	static {
		add(2);
	}
	
	static void add(int num) {
		System.out.print(num + " ");
	}
	
	public OrderOfInitializationPart3() {
		add(5);
	}
	
	static {
		add(4);
	}
	{
		add(6);
	}
	static {
		new OrderOfInitializationPart3();
	}
	{
		add(8);
	}
	public static void main(String[] args) {
		
	}
}
