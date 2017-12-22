package com.oracle.javacert.associate.chapter03._05arraylist;

import java.util.ArrayList;
import java.util.List;

public class SetMethod {
	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		System.out.println("size of birds " + birds.size());
		System.out.println(birds);
		birds.set(0, "robin");
		System.out.println("size of birds " + birds.size());
		System.out.println(birds);
		// birds.set(1, "robin"); 	//Throws an exception (IndexOutOfBoundException)
	}
}
