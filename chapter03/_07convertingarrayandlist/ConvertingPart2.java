package com.oracle.javacert.associate.chapter03._07convertingarrayandlist;

import java.util.Arrays;
import java.util.List;

public class ConvertingPart2 {
	public static void main(String[] args) {
		String[] array = { "hawk", "robin" };
		List<String> list = Arrays.asList(array); // returns fixed size list
		System.out.println(list);
		list.set(1, "test");
		System.out.println("- - - After set() - - -");
		System.out.println(list);
		array[0] = "new";
		for (String string : array) {
			System.out.print(string + " ");
		}
		// list.remove(1); Throws UnsupportedOperation Exception
		// because we are not allowed to change the size of the list
		// list.add("hawk");
		
	}
}
