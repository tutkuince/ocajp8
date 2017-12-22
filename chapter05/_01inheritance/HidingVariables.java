package com.oracle.javacert.associate.chapter05._01inheritance;

public class HidingVariables {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.getRodentDetails();
		mouse.getMouseDetails();
		
		System.out.println("Mouse num : " + mouse.num);
		
		
		Rodent rodent = new Rodent();
		System.out.println("Rodent num : " + rodent.num);
	}
}

class Rodent {
	protected int tailLength = 4;
	protected static int num = 5;

	public void getRodentDetails() {
		System.out.println("[parentTail=" + tailLength + "]");
	}
}

class Mouse extends Rodent {
	protected int tailLength = 8;	// shadowing
	protected static int num = 3;
	
	
	public void getMouseDetails() {
		System.out.println("[tail=" + tailLength + ", parentTail=" + super.tailLength + "]");
	}
}
