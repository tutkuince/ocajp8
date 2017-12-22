package com.oracle.javacert.associate.chapter03._01creatingmanipulatingstrings;

public class MethodChaining {
	/** Main method */
	public static void main(String[] args) {
		String s = "AniMaL     ";
		String trimmedS = s.trim();
		String lowercaseS = trimmedS.toLowerCase();
		String replaceS = lowercaseS.replace('a', 'A');
		System.out.println(replaceS);
		
		String result = s.trim().toLowerCase().replace('a', 'A'); // method chaining
		System.out.println(result);
		
		System.out.println("---------------------");
		
		String a = "abc";
		String b = a.toUpperCase();
		b = b.replace("B", "2").replace('C', '3');
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
