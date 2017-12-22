package com.oracle.javacert.associate.chapter03._01creatingmanipulatingstrings;

public class Immutability {
	private String s;

	public void setS(String newS) { // Setter makes it mutable
		s = newS;
	}

	public String getS() {
		return s;
	}
	/** Main method */
	public static void main(String[] args) {
		String s1 = "1";
		String s2 = s1.concat("2");	// s2 is 12
		s2.concat("3");
		System.out.println("s2 : " + s2);
	}
}
