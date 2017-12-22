package com.oracle.javacert.associate.chapter06._02trystatement;

public class TryStatement {
	
	public static void main(String[] args) {
		TryStatement ts = new TryStatement();
		ts.explore();
	}
	
	void explore() {
		try {
			fall();
			System.out.println("never get here");
		} catch (RuntimeException e) {
			System.out.println("RuntimeException");
		}
		System.out.println("After catch block");
	}
	
	void fall() {
		throw new RuntimeException();
	}
}
