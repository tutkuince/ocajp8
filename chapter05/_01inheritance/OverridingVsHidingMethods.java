package com.oracle.javacert.associate.chapter05._01inheritance;

/**
 * At runtime the child version of an overridden method is always executed
 * */

public class OverridingVsHidingMethods {
	public static void main(String[] args) {
		Kangaroo k = new Kangaroo();
		k.getMarsupialDescription();
		k.getKangarooDescription();
	}
}

class Marsupial{
	public boolean isBiped() {
		return false;
	}
	
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: " + isBiped());
	}
}

class Kangaroo extends Marsupial{
	@Override
	public boolean isBiped() {	// just run this method
		return true;
	}
	
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}
}
