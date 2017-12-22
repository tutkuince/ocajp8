package com.oracle.javacert.associate.chapter04._01methods;

public class ReturnType {
	public void walk1() {
	}

	public void walk2() {
		return;
	}
	public String walk3() {
		return "";
	}
	// public String walk4() {}						=> DOES NOT COMPILE
	// public walk5(){}								=> DOES NOT COMPILE
	// String walk6(int a) {if(a== 4) return ""};	=> DOES NOT COMPILE
}
