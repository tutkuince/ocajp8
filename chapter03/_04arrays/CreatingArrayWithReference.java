package com.oracle.javacert.associate.chapter03._04arrays;

public class CreatingArrayWithReference {
	/** Main method */
	public static void main(String[] args) {
		String[] bugs = { "cricket", "beetle", "ladybug" };
		String[] alias = bugs;
		System.out.println(bugs.equals(alias)); // true- because reference equality

		System.out.println("-----------------------");

		String[] str = { "stringValue" };
		Object[] objects = str;
		String[] againStr = (String[])objects;
		// againStr[0] = new StringBuilder(); 	// DOES NOT COMPILE => StringBuilder is not a String
		againStr[0] = new StringBuilder().toString();
		objects[0] = new StringBuilder();		// careful!
		againStr.toString();
		
		// int[] array = new int[];				// DOES NOT COMPILE => size missing
	}
}
