package com.oracle.javacert.associate.chapter04._06constructors;

public class OrderOfInitializationPart2 {
	private String name = "Tutku";
	{
		System.out.println(name);		// 4
	}
	private static int COUNT = 0;
	static {
		System.out.println(COUNT);		// 1
	}
	{
		COUNT++;
		System.out.println(COUNT);		// 3
	}

	public OrderOfInitializationPart2() {
		System.out.println("constructor");			// 5

	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("read to construct");	// 2
		OrderOfInitializationPart2 ooip2 = new OrderOfInitializationPart2();
	}
}
