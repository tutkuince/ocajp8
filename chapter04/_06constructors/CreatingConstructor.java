package com.oracle.javacert.associate.chapter04._06constructors;

public class CreatingConstructor {
	private String color;

	public CreatingConstructor() {
		System.out.println("Default constructor");
	}
	
	public CreatingConstructor(String color) {
		this.color = color;
		System.out.println("color is " + color);
	}

	// public creatingConstructor() {} // DOES NOT COMPILE
	// public void creatingConstructor() {} // DOES NOT COMPILE
	
	public static void main(String[] args) {
		CreatingConstructor cc1 = new CreatingConstructor("blue");
		CreatingConstructor cc2 = new CreatingConstructor();	// Default constructor
		System.out.println("cc1 " + cc1.color);
		System.out.println("cc2" + cc2.color);
	}
}
