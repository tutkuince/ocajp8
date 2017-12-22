package com.oracle.javacert.associate.chapter01javabuildingblocks._08variblescope;

public class VariableScope {
	
	
	static int MAX_LENGHT = 5; // class variable
	int lenght;
	
	public void grow(int inches){
		if(lenght < MAX_LENGHT){
			int newSize = lenght + inches;
			lenght = newSize;
		}
	}
	
	public void eatIfHungry(boolean hungry){
		if(hungry){
			int bitesOfCheese = 1;
			{
				@SuppressWarnings("unused")
				boolean teenyBit = true;
				System.out.println(bitesOfCheese);
			}
		}
		// System.out.println(teenyBit); // Does not compile
	}
}
