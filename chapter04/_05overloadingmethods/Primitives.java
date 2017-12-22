package com.oracle.javacert.associate.chapter04._05overloadingmethods;

public class Primitives {
	public void fly(int i) {
		System.out.println("int ");
	}
	public void fly(long l) {
		System.out.println("long ");
	}
	public static void main(String[] args) {
		Primitives p = new Primitives();
		p.fly(123);
		p.fly(123L);
	}
}
