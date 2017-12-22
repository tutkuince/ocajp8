package com.oracle.javacert.associate.chapter03._05arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveMethod {
	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds.remove("cardinal"));	// remove() return false if it cannot remove
		System.out.println(birds.remove("hawk"));		// remove() return true if it can remove
		System.out.println(birds);
		System.out.println(birds.remove(0));			// delete at 0 index and write at 0 index value
		System.out.println(birds);
	}
}
