package com.oracle.javacert.associate.chapter05._03interfaces;

public class InterfaceVariables {

}

interface CanSwim{
	int MAXIMUM_DEPTH = 100;	// public static final int MAXIMUM_DEPTH = 100;		
	final static boolean UNDERWATER = true;	// public final static boolean UNDERWATER = true;
	public static final String TYPE = "Submersible";
	
	// private int MAXIMUM_DEPTH = 100; // DOES NOT COMPILE -> private
	// protected int MAXIMUM_DEPTH = 100; // DOES NOT COMPILE  -> protected
	// public static int MAXIMUM_DEPTH = 100; // DOES NOT COMPILE  -> public static
}
