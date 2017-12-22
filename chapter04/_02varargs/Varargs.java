package com.oracle.javacert.associate.chapter04._02varargs;

public class Varargs {
	public void walk1(int... nums) {}
	public void walk2(int start, int... nums) {}
	// public void walk2(int... nums, int start) {}		=> DOES NOT COMPILE
	// public void walk2(int... nums, int... start) {}	=> DOES NOT COMPILE
	
	public static void walk(int start, int... nums) {
		System.out.println(nums.length);
	}
	
	public static void main(String[] args) {
		walk(1);
		walk(1, 2);
		walk(1, 2, 3);
		walk(1, new int[] {4, 5});
		// walk(1, null);	=> Throws an exception(NullPointerException)
	}
}
