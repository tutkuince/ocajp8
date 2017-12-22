package com.oracle.javacert.associate.chapter06;

// import java.util.*;
// import java.sql.*;

public class Deneme {
	public String color = "red";
	private void printColor(String color) {
		color = "purple";
		System.out.println(color);
	}
	
	
	
	public static void main(String[] args) {
		new Deneme().printColor("blue");
		// Date d = new Date();
		long l = Long.MAX_VALUE;
		float f = Float.MAX_VALUE;
		System.out.println(l > f);
	}
}

interface Jumpable {

}

class Animal{
	
}

class Lion extends Animal implements Jumpable{
	
}