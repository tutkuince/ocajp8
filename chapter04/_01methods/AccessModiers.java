package com.oracle.javacert.associate.chapter04._01methods;

/**
 * @author tutku ince
 * 
 * <b>public</b> the method can be called from any class
 * <b>private</b> the method can be called from within the same class
 * <b>protected</b> the method can only be called from classes in the same package or subclass
 * <b>default</b> the method can only be called from classes in the same package 
 * */

public class AccessModiers {
	public void walk1() {}
	// default void walk2() {}	=> DOES NOT COMPILE
	// void public walk3() {}	=> DOES NOT COMPILE
	void walk4() {}
	
}
