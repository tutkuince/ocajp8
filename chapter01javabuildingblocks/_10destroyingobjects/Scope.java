package com.oracle.javacert.associate.chapter01javabuildingblocks._10destroyingobjects;

public class Scope {
	public static void main(String[] args) {
		String one, two;
		one = new String("a");
		two = new String("b");
		one = two;
		String three = one;
		one = null;
		
		System.out.println("One : " + one);
		System.out.println("Two : " + two);
		System.out.println("Three : " + three);
	}
}
