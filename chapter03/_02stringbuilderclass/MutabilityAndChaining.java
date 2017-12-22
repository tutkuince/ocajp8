package com.oracle.javacert.associate.chapter03._02stringbuilderclass;

/**
 * @author tutku
 * 
 * <b>StringBuilder</b> changes its own state and returns a reference to itself
 * */

public class MutabilityAndChaining {
	/** Main method */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle");
		StringBuilder same = sb.append("+end");
		
		System.out.println("sb : " + sb);
		System.out.println("same : " + same);
		
		System.out.println("-------------------");
		
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
