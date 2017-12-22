package com.oracle.javacert.associate.chapter05._04polymorphism;

public class VirtualMethods {
	public static void main(String[] args) {
		Birds bird = new Peacock();
		bird.displayInformation();
	}
}

class Birds{
	public String getName() {
		return "Unknown";
	}
	
	public void displayInformation() {
		System.out.println("The bird name is : " + getName());
	}
}

class Peacock extends Birds{
	@Override
	public String getName() {
		return "Peacock";
	}
}
