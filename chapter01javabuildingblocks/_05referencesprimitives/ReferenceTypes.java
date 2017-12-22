package com.oracle.javacert.associate.chapter01javabuildingblocks._05referencesprimitives;

// You can only use reference to refer to the object
public class ReferenceTypes {
	String greeting; // Reference type declaration
	String name = "Tutku"; // declaration and initialization
	
	// greeting = "North star";
	
	
	String str = null;
	// int value = null; does not compile
	int value = 0;
	public static void main(String[] args) {
		ReferenceTypes r = new ReferenceTypes();
		r.name.length();
		//value.length(); // Does not compile
	}
}
