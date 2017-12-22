package com.oracle.javacert.associate.chapter05._01inheritance;

public class CreatingFinalMethods {
	
}

class Birds{
	public final boolean hasFeathers() {
		return true;
	}
	
	public final static void fly() {
		System.out.println("Bird is flying");
	}
}

class Penguin extends Birds{
	/*public final boolean hasFeathers() {	// final methods cannot be overridden
		return true;
	}*/
	
	/*public final static void fly() {		// you cannot hide a final static method 
		System.out.println("Bird is flying");
	}*/
}
