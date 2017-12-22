package com.oracle.javacert.associate.chapter06._01exceptions;

public class ReturnCodesVsExceptions {
	
	public int indexOf(String[] names, String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name)) {
				return i;
			}
		}
		return -1;
	}
}
