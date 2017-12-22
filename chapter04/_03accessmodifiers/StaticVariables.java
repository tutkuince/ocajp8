package com.oracle.javacert.associate.chapter04._03accessmodifiers;

import java.util.ArrayList;

public class StaticVariables {
	private static final int NUM_BUCKETS = 45;

	private static final ArrayList<String> values = new ArrayList<>();

	public static void main(String[] args) {
		// NUM_BUCKETS = 4; DOES NOT COMPILE, we cant change final value of NUM_BUCKETS
		System.out.println(NUM_BUCKETS);
		values.add("changed"); // we can call the methods on reference variable. we cannot reassign the final
								// values to point to a different object
		// values = new ArrayList<>(); Like this
	}

}
