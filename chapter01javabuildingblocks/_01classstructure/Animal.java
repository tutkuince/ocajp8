package com.oracle.javacert.associate.chapter01javabuildingblocks._01classstructure;

// Single-line comment
/*
 * Multiple-line comment
 * */

/**
 * Javadoc comment @author Tutku
 * */

public class Animal {
	String name;
	
	public String getName(){
		return name;
	}
	
	public void setName(String newName){
		name = newName;
	}
}

class Animal2{
	// One of the classes in the file is allowed to be public
}
/*
 * public class Animal2{
	// One of the classes in the file is allowed to be public
}*/
