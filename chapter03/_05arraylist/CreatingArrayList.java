package com.oracle.javacert.associate.chapter03._05arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreatingArrayList {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// ArrayList l1 = new ArrayList();		// default number of element
		//ArrayList l2 = new ArrayList(10);		// 10 number of slots
		// ArrayList l3 = new ArrayList(l2);	// make a copy of l2
		
		ArrayList<String> l1 = new ArrayList<>();		// same with l1
		ArrayList<String> l2 = new ArrayList<String>();	// same with l2
		
		List<String> l3 = new ArrayList<>();	// an ArrayList in a List reference variable
		// ArrayList<String> l4 = new List<>();	// but not versa
	}
}
