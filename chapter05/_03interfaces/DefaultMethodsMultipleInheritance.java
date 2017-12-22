package com.oracle.javacert.associate.chapter05._03interfaces;

public class DefaultMethodsMultipleInheritance {
	public static void main(String[] args) {
		System.out.println(new Cat().getCurrentSpeed());
	}
}

interface Walk {
	public default int getCurrentSpeed() {
		return 5;
	}
}

interface Run {
	public default int getCurrentSpeed() {
		return 10;
	}
}

class Cat implements Walk, Run {
	@Override						// subclass overrides the duplicate default methods
	public int getCurrentSpeed() {
		return 5;
	}
}