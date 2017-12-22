package com.oracle.javacert.associate.chapter04;

public class Notes {
	
	public static int length = 0;
	
	public static StringBuilder work(StringBuilder a, StringBuilder b) {
		a = new StringBuilder("a");
		b.append("b");
		return a;
	}
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("s1");
		StringBuilder s2 = new StringBuilder("s2");
		StringBuilder s3 = work(s1, s2);
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		
		Notes notes = new Notes();
		System.out.println(notes.howMany(true, new boolean[3]));
		
	}
	
	public int howMany(boolean b, boolean... b2) {
		return b2.length;
	}
}
