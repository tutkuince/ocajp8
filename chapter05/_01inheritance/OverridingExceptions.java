package com.oracle.javacert.associate.chapter05._01inheritance;

public class OverridingExceptions {

}

class InsufficientDataException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

class Reptile {
	protected boolean hasLegs() throws InsufficientDataException {
		throw new InsufficientDataException();
	}

	protected double getWeight() throws Exception {
		return 2;
	}
}

class Snake extends Reptile {
	@Override
	protected boolean hasLegs() {	 // throws InsufficientDataException can be, throws Exception cannot be
									// it must be at least broader or not
		return false;
	}

	@Override
	protected double getWeight() throws InsufficientDataException {	
		return 2;
	}
}
