package com.oracle.javacert.associate.chapter05._02abstractclasses;

public class CreatingAbstractClass {
	public static void main(String[] args) {
		// Animal animal = new Animal();	// cannot instantiated
	}
}

abstract class Animal {
	protected int age;

	public void eat() {
		System.out.println("Animal is eating");
	}

	public abstract String getName();
	
	// public abstract final void chew(); // the method cannot be overridden in subclass
	
	// private abstract void sign();	// not accessible
	
}

class Swan extends Animal {

	// public abstract void peck(); // DOES NOT COMPILE x-> abstract method only be defined in an abstract class
	
	/*
	 * public abstract String getName() { // abstract methods have not method body
		return "Swan";
	}
	 * */
	
	@Override
	public String getName() { // must implement the abstract methods
		return "Swan";
	}

}
