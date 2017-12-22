package com.oracle.javacert.associate.chapter05._03interfaces;

public class DefiningInterfaces {
	public static void main(String[] args) {
		// WalksOnTwoLegs wotl = new WalksOnTwoLegs();	// cannot instantiated
	}
}

interface WalksOnTwoLegs {
	
}

/*final interface WalksOnTwoLegs2 {	// interface cannot be final
	
}*/

interface CanFly{					// abstract interface CanFly
	void fly(int speed);			// public void fly(int speed);
	abstract void takeOff();		// public abstract void takeOff();
	public abstract double dive();	// public abstract double dive(); 
}

/*
 private final interface CanCrawl{
	 private void dig(int depth);
	 protected abstract double depth();
	 public final void surface();
 }
 */
