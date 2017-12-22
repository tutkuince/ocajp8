package com.oracle.javacert.associate.chapter05._01inheritance;

public class HidingStaticMethods {
	public static void main(String[] args) {
		Pitbull.eat();
	}
}

class Dog {
	public static void eat() {
		System.out.println("Dog is eating");
	}
	
	public static void run() {
		System.out.println("Dog is running");
	}
	
	public void sleep() {
		System.out.println("Dog is sleeping");
	}
	
	protected static void bite() {
		System.out.println("Dog is biting");
	}
}

class Pitbull extends Dog {
	public static void eat() {		// This is method hiding
		System.out.println("Pitbull is eating");
	}
	
	/*public void run() {
		System.out.println("Pitbull is running");	// compiler detects that you're trying to override a method	
	}*/
	
	/*public static void sleep() {
		System.out.println("Pitbull is sleeping");	// compiler detects that you're trying to override a method
	}*/
	
	public static void bite() {						// It is more accessible from parent class
		System.out.println("Pitbull is biting");
	}
}
