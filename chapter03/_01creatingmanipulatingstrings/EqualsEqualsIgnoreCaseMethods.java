package com.oracle.javacert.associate.chapter03._01creatingmanipulatingstrings;

/**
 * @author tutku
 * 
 * <b>equals()</b> checks whether two String objects contain exactly the same characters in the same order
 * <b>equalsIgnoreCase()</b> checks whether two String objects contain the same characters with the exception that it will convert the characters's case if needed
 * */

public class EqualsEqualsIgnoreCaseMethods {
	/** Main method */
	public static void main(String[] args) {
		String str = "animals";
		String str2 = new String(str);
		
		System.out.println("str == str2 ? " + (str == str2));
		System.out.println("str equals to str2 ? " + str.equals(str2));
		System.out.println(str.equalsIgnoreCase("ANIMALS"));
		
		System.out.println("------------------");
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1.equalsTo(s2) : " + s1.equals(s2));
		System.out.println("s1 != s2 : " + (s1 != s2));
		
		System.out.println("-----------------");
		String s3 = "Java";
		String s4 = "Java";
		System.out.println("s3 == s4 : " + (s3 == s4));	// it refer to the same String object created in the string pool
		System.out.println("s3.equalsTo(s4) : " + s3.equals(s4));
		
		System.out.println("-----------------");
		String lang1 = "Java";
		String lang2 = "JaScala";
		System.out.println("lang1 == lang2 " + ((lang1.substring(0, 1) == lang2.substring(0, 1))));
		System.out.println("lang1.equalsTo(lang2) " + (lang1.substring(0, 1).equals(lang2.substring(0, 1))));
		
	}
}
