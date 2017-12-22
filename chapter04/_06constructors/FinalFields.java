package com.oracle.javacert.associate.chapter04._06constructors;

public class FinalFields {
	private final int volume;
	private final String name = "Tutku Ince";

	public FinalFields(int length, int width, int height) {
		volume = length * width * height;
		// name = "Mahmut";	DOES NOT COMPILE 
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		FinalFields ff = new FinalFields(10, 10, 10);
		System.out.println(ff.volume);
	}
}
