package com.oracle.javacert.associate.chapter04._8lambdas;

import java.util.ArrayList;
import java.util.List;

public class Predicates {
	public Predicates() {

	}

	public Predicates(int i) {
		this();
		
	}
	public void i() {
		
	}
	String s = "";

	public static void main(String[] args) {
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floopy");
		bunnies.add("hoopy");
		System.out.println(bunnies);
		bunnies.removeIf(a -> a.charAt(0) != 'h');
		System.out.println(bunnies);
		
	}
}
