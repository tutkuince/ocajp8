package com.oracle.javacert.associate.chapter03._07convertingarrayandlist;

import java.util.Arrays;
import java.util.List;

public class ConvertinPart3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("one", "two");	// asList() takes 'varargs'
		System.out.println(list);
	}
}
