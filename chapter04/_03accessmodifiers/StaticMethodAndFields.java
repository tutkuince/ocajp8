package com.oracle.javacert.associate.chapter04._03accessmodifiers;

public class StaticMethodAndFields {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Koala koala = new Koala();
		System.out.println(koala.count);	// 0
		koala = null;
		System.out.println(koala.count);	// 0
		koala.count = 4;
		System.out.println(koala.count);	// 4
		Koala k1 = new Koala();
		Koala k2 = new Koala();
		k1.count = 6;
		k2.count = 5;
		System.out.println(Koala.count);
	}
}
class Koala{
	public static int count = 0;
}
