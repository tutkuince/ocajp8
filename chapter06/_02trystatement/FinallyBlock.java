package com.oracle.javacert.associate.chapter06._02trystatement;

public class FinallyBlock {
	public static void main(String[] args) {
		String s = "";
		try {
			s += "t";	// 1
		} catch (Exception e) {
			s += "c";
		} finally {
			s += "f";	// 2
		}
		
		s += "a";		// 3
		System.out.println(s);	// result is tfa
	}
}
