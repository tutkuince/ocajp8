package com.oracle.javacert.associate.chapter04._05overloadingmethods;

public class ReferenceTypes {
	public void fly(String s) {
		System.out.println("string ");
	}
	
	public void fly(Object o) {
		System.out.println("object ");
	}
	
	public static void main(String[] args) {
		ReferenceTypes rt = new ReferenceTypes();
		rt.fly("test");
		rt.fly(56);
	}
}
