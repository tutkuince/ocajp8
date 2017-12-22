package com.oracle.javacert.associate.chapter03._05arraylist;

import java.util.ArrayList;
import java.util.List;

public class ClearMethod {
	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");
		System.out.println("is empty : " + birds.isEmpty());
		System.out.println("size : " + birds.size());
		birds.clear();								// discard all elements of the ArrayList
		System.out.println("is empty : " + birds.isEmpty());
		System.out.println("size : " + birds.size());
	}
}
