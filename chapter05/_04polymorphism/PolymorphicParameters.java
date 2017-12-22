package com.oracle.javacert.associate.chapter05._04polymorphism;

public class PolymorphicParameters {
	public static void main(String[] args) {
		ZooWorker.feed(new Alligator());
		ZooWorker.feed(new Crocodile());
		ZooWorker.feed(new Reptile());
	}
}

class Reptile {
	public String getName() {
		return "Reptile";
	}
}

class Alligator extends Reptile {
	@Override
	public String getName() {
		return "Alligator";
	}
}

class Crocodile extends Reptile {
	@Override
	public String getName() {
		return "Crocodile";
	}
}

class ZooWorker {
	public static void feed(Reptile reptile) {
		System.out.println("Feeding reptile " + reptile.getName());
	}
}
