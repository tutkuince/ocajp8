package com.oracle.javacert.associate.chapter04._05overloadingmethods;

public class OverladingMethod {
	public void fly(int numMiles) {

	}
	
	//public void fly(short numMiles) {}	DOES NOT COMPILE

	public void fly(short numFeet) {

	}

	public boolean fly() {
		return false;
	}

	void fly(int numMiles, short numFeet) {

	}

	public void fly(short numFeet, int numMiles) throws Exception {

	}
}
