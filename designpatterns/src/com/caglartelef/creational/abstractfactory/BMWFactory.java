package com.caglartelef.creational.abstractfactory;

public class BMWFactory extends ArabaFactory{

	@Override
	public Sase createSase() {
		// TODO Auto-generated method stub
		return new BMWSase();
	}

	@Override
	public Motor createMotor() {
		// TODO Auto-generated method stub
		return new BMWMotor();
	}

	@Override
	public Tekerlek createTekerlek() {
		// TODO Auto-generated method stub
		return new BMWTekerlek();
	}

}
