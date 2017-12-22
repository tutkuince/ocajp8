package com.oracle.javacert.associate.chapter01javabuildingblocks._04creatingobjects;

public class ReadingWritingObjectFields {
	int number; // Instance variable
	public static void main(String[] args) {
		ReadingWritingObjectFields r = new ReadingWritingObjectFields();
		r.number = 1;	// set variable
		System.out.println(r.number);	// read variable
	}
}
