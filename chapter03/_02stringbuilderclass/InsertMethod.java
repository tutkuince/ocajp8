package com.oracle.javacert.associate.chapter03._02stringbuilderclass;

/**
 * @author tutku
 * 
 * <b>insert()</b> adds characters to the StringBuilder at the requested index
 * */

public class InsertMethod {
	/** Main method */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("animals");
		sb.insert(7, '-');		// animals-
		sb.insert(0, "-");		// -animals-
		sb.insert(4, "-");		// -ani-mals-
		System.out.println("sb : " + sb);
	}
}
