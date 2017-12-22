package com.oracle.javacert.associate.chapter03._05arraylist;

import java.util.ArrayList;
import java.util.List;

public class IsEmptyAndSizeMethods {
	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		System.out.println("birds is empty " + birds.isEmpty());
		System.out.println("birds size " + birds.size());
		birds.add("hawk");
		birds.add("robin");
		System.out.println("birds is empty " + birds.isEmpty());
		System.out.println("birds size " + birds.size());
		
	}
}
