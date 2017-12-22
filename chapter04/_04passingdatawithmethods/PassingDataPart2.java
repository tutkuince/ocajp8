package com.oracle.javacert.associate.chapter04._04passingdatawithmethods;

public class PassingDataPart2 {
	public static void main(String[] args) {
		int number = 1;
		String letters = "abc";
		number(number);	//1
		letters = letters(letters);	//abcd
		System.out.println(number + letters);
		number = number(number);
		System.out.println(number + letters);
	}
	
	public static int number(int number) {
		number++;
		return number;
	}
	
	public static String letters(String letters) {
		letters += "d";
		return letters;
	}
}
