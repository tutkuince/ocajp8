package com.oracle.javacert.associate.chapter01javabuildingblocks._05referencesprimitives;

public class Primitives {
	boolean bool;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	
	int million1 = 1000000;
	int million2 = 1_000_000;	// These are same numbers
	
	/* You can add underscores anywhere except at:
	 * the beginning of a literal, 		_1_0;
	 * end of the literal,				10_;
	 * right before a decimal point,	1_.0;
	 * right after a decimal point 		1._0;
	 */
	
	public static void main(String[] args) {
		System.out.println("Max byte : " + Byte.MAX_VALUE);
		System.out.println("Max short : " + Short.MAX_VALUE);
		System.out.println("Max int : " + Integer.MAX_VALUE);
		System.out.println("Max long : " + Long.MAX_VALUE);
		System.out.println("Max float : " + Float.MAX_VALUE);
		System.out.println("Max double : " + Double.MAX_VALUE);
		System.out.println("Max char : "+Character.MAX_VALUE);
		
		// long max = 12;  Does not compile
		// long max = 12L; compiles
		
		System.out.println(56);		//56
		System.out.println(0b11);	//3
		System.out.println(017);	//15
		System.out.println(0x1F);	//31
		
		
	}
}
