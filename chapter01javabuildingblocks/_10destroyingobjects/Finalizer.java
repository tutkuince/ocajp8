package com.oracle.javacert.associate.chapter01javabuildingblocks._10destroyingobjects;

public class Finalizer {
	protected void filanize(){
		System.out.println("Calling finalize");
	}
	public static void main(String[] args) {
		Finalizer f = new Finalizer();
		f.filanize();
	}
}
