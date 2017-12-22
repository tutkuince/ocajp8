package com.oracle.javacert.associate.chapter05._01inheritance;

public class OverridingMethod {
	public static void main(String[] args) {
		System.out.println(new Canine().getAverageWeight());
		System.out.println(new Wolf().getAverageWeight());
	}
}

class Canine {
	public double getAverageWeight() {
		return 50;
	}
}

class Wolf extends Canine {
	@Override
	public double getAverageWeight() {
		return super.getAverageWeight() + 20;
		// return getAverageWeight() + 20; //Infinite Loop => you should use super for using parent's method
	}
}
