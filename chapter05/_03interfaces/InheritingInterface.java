package com.oracle.javacert.associate.chapter05._03interfaces;

public class InheritingInterface {
	
}

interface HasTail{
	public int getTailLength();
}

interface HasWhiskers{
	public int getNumerOfWhiskers();
}

interface Seal extends HasTail, HasWhiskers{
	
}

class LeopardSeal implements Seal{	// implements HasTail, HasWhiskers

	@Override
	public int getTailLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumerOfWhiskers() {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
