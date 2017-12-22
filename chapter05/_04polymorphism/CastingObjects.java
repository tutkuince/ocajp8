package com.oracle.javacert.associate.chapter05._04polymorphism;

public class CastingObjects {
	public static void main(String[] args) {
		// Fish fish = new Fish();
		// Bird bird = (Bird) fish;	// DOES NOT COMPILE
		
		// Rodent rodent = new Rodent();
		// Capybara capybara = (Capybara)rodent; // Run time exception (ClassCastException)
		
		// Capybara capybara = new Capybara();
		// Rodent rodent = capybara;
		
		Rodent rodent = new Rodent();
		if(rodent instanceof Capybara) {
			Capybara capybara = (Capybara)rodent;
			System.out.println(capybara.toString());
		}
		
	}
}

class Bird {

}

class Fish {

}

class Rodent{
	
}

class Capybara extends Rodent{
	
}