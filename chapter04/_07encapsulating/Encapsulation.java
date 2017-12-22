package com.oracle.javacert.associate.chapter04._07encapsulating;

public class Encapsulation {
	private int numberEggs;
	private boolean walk;

	public void setNumberEggs(int numberEggs) { // setter
		if (numberEggs >= 0) {
			this.numberEggs = numberEggs;		// guard condition
		}
	}

	public int getNumberEggs() { // getter
		return numberEggs;
	}

	public boolean isWalk() { // getter
		return walk;
	}

	public void setWalk(boolean walk) { // setter
		this.walk = walk;
	}
}
