package com.oracle.javacert.associate.chapter02._05javastatements;

import java.util.ArrayList;
import java.util.List;

public class ForeachStatement {
	public static void main(String[] args) {
		String[] names = new String[2];
		names[0] = "Tutku";
		names[1] = "Ince";
		
		for (String name : names) {
			System.out.println(name);				// For-each loop
		}
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);			// For loop
		}
		
		List<String> values = new ArrayList<String>();
		values.add("Tutku");
		values.add("Ince");
		for (String val : values) {
			System.out.println(val);
		}
		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i));
		}
	}
}
