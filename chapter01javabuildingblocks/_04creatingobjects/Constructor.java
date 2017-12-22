package com.oracle.javacert.associate.chapter01javabuildingblocks._04creatingobjects;

/* Constructor rules:
 * 1) the name of constructor matches the name of the class
 * 2) there is no return type.
 * 
 * The purpose of a constructor is to initialize fields
 * */

public class Constructor {
	int number = 0;	// Initialize on line
	String name;
	public Constructor() {
		name = "Tutku";	// Initialize in constructor
	}
	
	/*
	 * public void Constructor() {
		// This is not constructor
	   }
	 */
}
