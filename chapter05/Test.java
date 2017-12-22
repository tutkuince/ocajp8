package com.oracle.javacert.associate.chapter05;



public class Test extends Writer {

	public static void write() {
		System.out.println("Writing code");
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Writer w = new Test();
		w.write();

		
		meth(new String("asdas"));
	}
	
	static void meth(Object o) {
		
	}
}

abstract class Writer {
	public static void write() {
		System.out.println("Writing...");
	}
}

class Author extends Writer {
	public static void write() {
		System.out.println("Writing book");
	}
}

class Employee {

}

class Manager extends Employee {

}