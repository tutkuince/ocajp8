package com.oracle.javacert.associate.chapter05._01inheritance;

public class RedeclaringPrivateMethods {
	
}

class Bear {
	@SuppressWarnings("unused")
	private String roar() {
		return "Rooar";
	}
}

class PolarBear extends Bear {
	@SuppressWarnings("unused")
	private int roar() {
		return 2;
	}
}
