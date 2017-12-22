package com.oracle.javacert.associate.chapter04._07encapsulating;

public class CreatingImmutableClasses {
	private int numberEggs;

	public CreatingImmutableClasses(int numberEggs) {
		this.numberEggs = numberEggs;
	}

	public int getNumberEggs() {
		return numberEggs;
	}

	// there is no setter, so we can set with constructor but we can't change value
	// second time.
}
