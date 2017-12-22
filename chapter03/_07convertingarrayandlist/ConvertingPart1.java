package com.oracle.javacert.associate.chapter03._07convertingarrayandlist;

import java.util.ArrayList;
import java.util.List;

public class ConvertingPart1 {
	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("robin");
		System.out.println("birds : " + birds);
		System.out.println("birds size : " + birds.size());
		System.out.println("----------------");
		Object[] objectArray = birds.toArray();
		for (int i = 0; i < objectArray.length; i++) {
			if (i == 0) {
				System.out.print("objectArray : [");
			}
			System.out.print(objectArray[i]);
			if (i < objectArray.length - 1) {
				System.out.print(", ");
			} else {
				System.out.print("]");
			}
		}
		System.out.println("\nobjectArray size : " + objectArray.length);
		System.out.println("\n----------------");
		String[] stringArray = birds.toArray(new String[0]); // java will create a new array of proper size for the
																// return
																// value
		for (int i = 0; i < stringArray.length; i++) {
			if (i == 0) {
				System.out.print("stringArray : [");
			}
			System.out.print(stringArray[i]);
			if (i < stringArray.length - 1) {
				System.out.print(", ");
			} else {
				System.out.print("]");
			}
		}
		System.out.println("\nstringArray size : " + stringArray.length);
	}
}
