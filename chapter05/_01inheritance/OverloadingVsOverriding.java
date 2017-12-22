package com.oracle.javacert.associate.chapter05._01inheritance;

public class OverloadingVsOverriding {

}

class Bird{
	public void fly() {
		System.out.println("Bird is flying");
	}
	public void eat(int food) {
		System.out.println("Bird is eating food");
	}
}

class Eagle extends Bird{
	public int fly(int height) {	// Overloaded
		System.out.println("Bird is flying at " + height + " meters");
		return height;
	}
	
	/*public int eat(int food) {	// DOES NOT COMPILE	// it must have same signature with eat method 
		System.out.println("Bird is eating food");
		return food;
	}
	*/
	@Override
	public void eat(int food) {		// Overriding
		System.out.println("Bird is eating food");
	}
}

class Camel{
	protected String getNumberOfHumps() {
		return "Undefined";
	}
}

class BactrianCamel extends Camel{
	/*private int getNumberOfHumps() {	// it must be at least as accessible as the parent
		return 2;
	}
	*/
	@Override
	protected String getNumberOfHumps() {
		return "2";
	}
}
