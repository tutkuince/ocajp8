package com.oracle.javacert.associate.chapter04._06constructors;

public class ConstructorChaining {
	private int numTeeth;
	private int numWhiskers;
	private int weight;

	public ConstructorChaining(int weight) {
		this(weight, 16);
	}

	public ConstructorChaining(int weight, int numTeeth) {
		this(weight, numTeeth, 20);
	}

	public ConstructorChaining(int weight, int numTeeth, int numWhiskers) {
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
	}
	
	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	}
	public static void main(String[] args) {
		ConstructorChaining cc = new ConstructorChaining(15);
		cc.print();
	}
}
