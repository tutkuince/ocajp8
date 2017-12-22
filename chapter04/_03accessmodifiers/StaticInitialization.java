package com.oracle.javacert.associate.chapter04._03accessmodifiers;

public class StaticInitialization {
	private static final int NUM_SECONDS_PER_HOUR;
	
	private static int one;
	private static final int two;
	private static final int three = 3;
	// private static final int four;	DOES NOT COMPILE, not initialized
	
	static {
		int numSecondsPerMinute = 60;
		int numMinutesPerHour = 60;
		NUM_SECONDS_PER_HOUR = numMinutesPerHour * numSecondsPerMinute;
		
		one = 1;
		two = 2;
		// three = 3;	DOES NOT COMPILE	we cannot change final value
		// two = 4;		DOES NOT COMPILE	we cannot change final value
	}
	public static void main(String[] args) {
		System.out.println(NUM_SECONDS_PER_HOUR);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}
}
