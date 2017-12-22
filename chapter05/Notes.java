package com.oracle.javacert.associate.chapter05;

public class Notes {

}

class Rodent{
	protected static Number chew() throws Exception{
		System.out.println("Rodent is chewing");
		return 1;
	}
}

class Beaver extends Rodent{
	public static Integer chew() throws RuntimeException{
		System.out.println("Beaver is chewing on wood");
		return 2;
	}
}

interface has{
	abstract int get();
	public static void gone() {
		
	}
}

abstract class Insect implements has{
	abstract int getNum();
}

class Beetle extends Insect{

	@Override
	public int get() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int getNum() {
		// TODO Auto-generated method stub
		return 0;
	}
}

abstract class Bird{
	public static void go() {
		
	}
}

interface Ciguli{
	Number num();
	static void idi() {
		
	}
}

class CiguliClass implements Ciguli{
	@Override
	public Number num() {
		return new Integer(1); // Covariant return type
	}
}