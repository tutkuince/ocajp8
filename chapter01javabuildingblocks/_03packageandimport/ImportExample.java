package com.oracle.javacert.associate.chapter01javabuildingblocks._03packageandimport;

//import java.util.Random;	// If you do not use import java.util.Random; Does not compile 
import java.util.*; // import java.util.Random among other things
//import java.util.Random; // Redundant import
/*
 * '*' doesn't import child packages, fields, or methods
 * */

public class ImportExample {
	/* Main method */
	public static void main(String[] args) {
		Random rnd = new Random();	// Random cannot be resolved to a type
		System.out.println(rnd.nextInt(10));	// Print a number between 0 and 9
	}
}
