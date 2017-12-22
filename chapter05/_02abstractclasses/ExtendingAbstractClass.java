package com.oracle.javacert.associate.chapter05._02abstractclasses;

public class ExtendingAbstractClass {

}

abstract class Animals{
	public abstract String getName();
}

abstract class BigCat extends Animal{
	public abstract void roar();
}

class Lion extends BigCat{

	@Override
	public void roar() {
		System.out.println("The Lion lets out a loud ROAR!!!");
		
	}

	@Override
	public String getName() {
		return "Lion";
	}
	
}
