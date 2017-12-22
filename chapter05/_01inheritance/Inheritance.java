package com.oracle.javacert.associate.chapter05._01inheritance;

public class Inheritance {
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.setAge(5);
		lion.roar();

	}
}

class Animal {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		}
	}
}

class Lion extends Animal {
	public void roar() {
		System.out.println("The " + getAge() + " year old lion says: Roar!");
	}
}
