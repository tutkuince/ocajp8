package com.oracle.javacert.associate.chapter03._05arraylist;

import java.util.ArrayList;
import java.util.List;

public class ContainsMethod {
	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		System.out.println(birds.contains("hawk"));		// true
		System.out.println(birds.contains("robin"));	// false
		System.out.println(birds.contains("Hawk"));		// false because it is case sensitive
	}
}
