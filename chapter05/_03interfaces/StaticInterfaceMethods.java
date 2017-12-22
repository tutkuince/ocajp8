package com.oracle.javacert.associate.chapter05._03interfaces;

public class StaticInterfaceMethods {
	public static void main(String[] args) {
		Bunny bunny = new Bunny();
		bunny.getPrintDetails();
	}
}

interface Hop{
	static int getJumpHeight() {
		return 9;
	}
	
}

class Bunny implements Hop{
	public void getPrintDetails() {
		System.out.println(Hop.getJumpHeight());
		// System.out.println(getJumpHeight()); // DOES NOT COMPILE
	}
}
