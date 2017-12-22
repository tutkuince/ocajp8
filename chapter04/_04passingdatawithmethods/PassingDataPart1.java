package com.oracle.javacert.associate.chapter04._04passingdatawithmethods;

public class PassingDataPart1 {
	public static void main(String[] args) {
		int num = 4;
		newNumber(5);
		System.out.println("num is " + num);
		
		String name = "Tutku";
		speak(name);
		System.out.println("name is " + name);
		
		StringBuilder sb = new StringBuilder();
		speak(sb);
		System.out.println(sb);
		
		int o1 = 1;
		int o2 = 2;
		swap(o1, o2);
		System.out.println("o1 is " + o1);
		System.out.println("o2 is " + o2);
	}
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void speak(String name) {
		name = "Utku";
	}
	
	public static void speak(StringBuilder name) {
		name.append("SB Tutku");
	}
	
	public static void newNumber(int num) {
		num = 8;
	}
}
