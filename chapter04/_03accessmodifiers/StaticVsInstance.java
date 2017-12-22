package com.oracle.javacert.associate.chapter04._03accessmodifiers;

public class StaticVsInstance {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		System.out.println(Counter.count);
		
		// Counter.nonStaticCounter;	
	}
}

class Static {
	@SuppressWarnings("unused")
	private String name = "Static class";

	public static void first() {

	}

	public static void second() {

	}

	public static void third() {
		// System.out.println(name); // static reference to a nonstatic method
	}
}

class Counter {
	static int count;
	int nonStaticCounter;

	public Counter() {
		count++;
	}
}
