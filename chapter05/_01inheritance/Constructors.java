package com.oracle.javacert.associate.chapter05._01inheritance;

public class Constructors {
	public static void main(String[] args) {
		Zebra z = new Zebra();
		System.out.println(z.getAge());
	}
	
}

class Animal1 {
	private int age;

	public Animal1(int age) {
		this.age = age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
}

class Zebra extends Animal1 {
	public Zebra(int age) {
		super(age);
	}

	public Zebra() {
		this(4);	// call Zebra's another constructor
	}
}
