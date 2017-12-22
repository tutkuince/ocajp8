package com.oracle.javacert.associate.chapter01javabuildingblocks._07initializationofvar;

// in scope from declaration until object garbage collected

public class InstanceVariables {
	// Instance variables
	boolean bool;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	
	public static void main(String[] args) {
		InstanceVariables i = new InstanceVariables();
		System.out.println("These are instance variable's default values");
		System.out.println("boolean : " + i.bool);
		System.out.println("byte : " + i.b);
		System.out.println("short : " + i.s);
		System.out.println("int : " + i.i);
		System.out.println("long : " + i.l);
		System.out.println("float : " + i.f);
		System.out.println("double : " + i.d);
	}
}
