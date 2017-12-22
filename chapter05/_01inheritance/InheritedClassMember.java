package com.oracle.javacert.associate.chapter05._01inheritance;

public class InheritedClassMember {
	public static void main(String[] args) {
		Shark shark = new Shark(3);
		shark.displaySharkDetails();
	}

}

class Fish {
	protected int size;
	private int age;

	public int getAge() {
		return age;
	}

	public Fish(int age) {
		this.age = age;
	}
}

class Shark extends Fish {
	private int numberOfFins = 8 * getAge();

	public Shark(int age) {
		// super	// DOES NOT COMPILE
		super(age);
		super.size = age * 3;
		//super().setAge(10)	// DOES NOT COMPILE
	}

	public void displaySharkDetails() {
		System.out.print("Shark with age: " + super.getAge()); // age is private so it is not accessible
		System.out.print(" and " + super.size + " meters long "); // size is protected so it is accessible (size) x->
																	// this.size // compile
		System.out.print("with " + this.numberOfFins + " fins"); // (numberOfFins) x-> super.numberOfFins // Does not compile
		
																	

	}
}
