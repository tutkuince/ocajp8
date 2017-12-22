package com.oracle.javacert.associate.chapter03._01creatingmanipulatingstrings;

/** 
 * @author tutku
 * 
 * <b>Strings</b> not in the string pool are garbage collected just like any other object.
 *  */

public class CreatingString {
	String name1 = "Tutku";				// name1 goes to string pool 
	String name2 = new String("Tutku");	// name2 is the reference of String object that it points on heap

	char[] name3 = { 'T', 'u', 't', 'k', 'u' };
	String name4 = new String(name3);
}
