package com.oracle.javacert.associate.chapter05._03interfaces;

public class DefaultInterfaceMethods {

}

interface IsWarmBlooded{
	boolean hasScales();
	public default double getTemperature() {
		return 10.0;
	}
}

interface Carnivore{
	// public default void eatMeat();	// it needs a method body
	/*
	 * public int getRequiredFoodAmount(){	// it must be 'public default'
	 * 	return 13;
	 * }
	 * */
}

class Snake implements IsWarmBlooded{

	@Override
	public boolean hasScales() {
		// TODO Auto-generated method stub
		return false;
	}
	
	//@Override			// If you need you can override this method
	//public double getTemperature() {
	//	return IsWarmBlooded.super.getTemperature();
	//}
	
}
