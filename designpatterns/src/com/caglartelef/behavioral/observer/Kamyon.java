package com.caglartelef.behavioral.observer;

public class Kamyon extends Arac {

	@Override
	public void git() {
		System.out.println("TRUCK is going");
	}

	@Override
	public void dur() {
		System.out.println("TRUCK stopped");
	}

}
