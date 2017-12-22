package com.oracle.javacert.associate.chapter04._06constructors;

public class OrderOfInitialization {
	private String name = "Tutku";
	{
		System.out.println(name);			// 3
	}
	private static int COUNT = 0;
	static {
		System.out.println(COUNT);			// 1
	}
	static {
		COUNT += 1;
		System.out.println(COUNT);			// 2
	}
	
	public OrderOfInitialization() {
		System.out.println("constructor");	// 4
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		OrderOfInitialization ooi = new OrderOfInitialization();
	}
}
