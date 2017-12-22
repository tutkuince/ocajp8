package com.oracle.javacert.associate.chapter05._03interfaces;

public class MultipleInheritance {

}

interface Heribvore{
	public void eatPlants(int quantity);
	// public int drinkWater();		// DOES NOT COMPILE
}

interface Omnivore{
	public void eatPlants();
	public void eatMeat();
	// public void drinkWater();	// DOES NOT COMPILE
}

class Bear implements Heribvore, Omnivore{

	@Override
	public void eatPlants() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eatMeat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eatPlants(int quantity) {
		// TODO Auto-generated method stub
		
	}

}
