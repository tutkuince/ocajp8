package com.oracle.javacert.associate.chapter03._06wrapperclasses;

public class Wrapper {
	public static void main(String[] args) {
		int primitive = Integer.parseInt("123");	// return a primitive
		Integer wrapper = Integer.valueOf("123");	// return a wrapper class
		System.out.println("primitive : " + primitive);
		System.out.println("wrapper : " + wrapper);
		
		// int bad1 = Integer.parseInt("a");			// throws NumberFormatException
		// Integer bad2 = Integer.valueOf("123.45");	// throws NumberFormatException
		
		boolean bool1 = Boolean.parseBoolean("true");
		Boolean bool2 = Boolean.valueOf("true");
		System.out.println("bool1 : " + bool1);
		System.out.println("bool2 : " + bool2);
		
		byte byte1 = Byte.parseByte("1");
		Byte byte2 = Byte.valueOf("1");
		System.out.println("byte1 : " + byte1);
		System.out.println("byte2 : " + byte2);
		
		short short1 = Short.parseShort("12");
		Short short2 = Short.valueOf("123");
		System.out.println("short1 : " + short1);
		System.out.println("short2 : " + short2);
	}
}
