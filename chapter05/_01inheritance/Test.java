package com.oracle.javacert.associate.chapter05._01inheritance;

public abstract class Test {
	private void fly() {
		System.out.println("Bird is flying");
	}
	
	public static void main(String[] args) {
		Test test = new Pelican();
		test.fly();
	}
}

class Pelican extends Test{
	protected void fly() {
		System.out.println("Pelican is flying");
	}
}