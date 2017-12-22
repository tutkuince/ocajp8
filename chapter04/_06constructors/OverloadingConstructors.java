package com.oracle.javacert.associate.chapter04._06constructors;

@SuppressWarnings("unused")
public class OverloadingConstructors {

	private String color;
	private int weight;

	public OverloadingConstructors(int weight) { // first constructor
		this.weight = weight;
		color = "brown";
	}

	public OverloadingConstructors(int weight, String color) { // second constructor
		this.weight = weight;
		this.color = color;
	}

}
