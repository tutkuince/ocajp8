package com.oracle.javacert.associate.chapter05;

abstract class Ball {
	protected final int size;

	public Ball(int size) {
		this.size = size;
	}
}

interface Equipment {
}

public class SoccerBall extends Ball implements Equipment {
	public SoccerBall() {
		super(5);
	}

	public Ball get() {
		return this;
	}

	public static void main(String[] passes) {
		Equipment equipment = (Equipment) (Ball) new SoccerBall().get();
		System.out.print(((SoccerBall) equipment).size);
	}
}
