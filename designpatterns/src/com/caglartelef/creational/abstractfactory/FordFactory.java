package com.caglartelef.creational.abstractfactory;

public class FordFactory extends ArabaFactory{
	
	@Override
	public Sase createSase() {
		// TODO Auto-generated method stub
		return new FordSase();
	}

	@Override
	public Motor createMotor() {
		// TODO Auto-generated method stub
		return new FordMotor();
	}

	@Override
	public Tekerlek createTekerlek() {
		// TODO Auto-generated method stub
		return new FordTekerlek();
	}
	
}
