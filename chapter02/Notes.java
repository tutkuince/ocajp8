package com.oracle.javacert.associate.chapter02;

import java.util.ArrayList;

public class Notes {
	public static void main(String[] args) {
		String s = "animals";
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 7));
		System.out.println(s.substring(3,3));
		System.out.println(s.replace('a', 'A'));
		
		ArrayList<String> list = new ArrayList<>();
		list.remove(0);
		
	}
}
