package com.oracle.javacert.associate.chapter01javabuildingblocks._04creatingobjects;

public class InstanceInitializerBlocks {
	private String name = "Tutku";
	{ System.out.println("setting field"); }
	
	public InstanceInitializerBlocks() {
		name = "Passion";
		System.out.println("setting constructor");
	}
	
	public static void main(String[] args) {
		InstanceInitializerBlocks i = new InstanceInitializerBlocks();
		System.out.println(i.name);
	}
}
