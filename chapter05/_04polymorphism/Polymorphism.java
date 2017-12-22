package com.oracle.javacert.associate.chapter05._04polymorphism;

public class Polymorphism {
	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println("Age : " + lemur.age);

		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());

		Primate primate = lemur;
		System.out.println("has hair: " + primate.hasHair());

		// System.out.println(hasTail.age); // DOES NOT COMPILE
		// System.out.println(primate.isTailStriped()); // DOES NOT COMPILE
		
		// Object lemurObject = lemur;	// Compile
		
	}
}

class Primate {
	public boolean hasHair() {
		return true;
	}
}

interface HasTail {
	public boolean isTailStriped();
}

class Lemur extends Primate implements HasTail {
	@Override
	public boolean isTailStriped() {
		return false;
	}

	public int age = 10;
}
