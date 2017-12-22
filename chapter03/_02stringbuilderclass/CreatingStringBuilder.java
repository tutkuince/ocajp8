package com.oracle.javacert.associate.chapter03._02stringbuilderclass;

public class CreatingStringBuilder {
	/** Main method */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();			// empty sequence of characters 
		StringBuilder sb2 = new StringBuilder("animals");	// create with containing a specific value
		StringBuilder sb3 = new StringBuilder(10);			// reserve number of slots for characters
		StringBuilder sb4 = new StringBuilder(sb1);			// create with a StringBuilder object
		
		
		System.out.println("sb3 capacity : " + sb3.capacity());	// capacity of the sb3
		System.out.println("sb3 size : " + sb3.length());		// size of the sb3
	}
}
