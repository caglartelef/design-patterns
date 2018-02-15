package com.caglartelef.creational.abstractfactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArabaFactory arabaFactory = new BMWFactory();
		Motor m1 =   arabaFactory.createMotor();
		Sase s1 =   arabaFactory.createSase();
		Tekerlek t1 =   arabaFactory.createTekerlek();
		System.out.println(m1.getClass());
		System.out.println(s1.getClass());
		System.out.println(t1.getClass());
		
		
		arabaFactory = new FordFactory();
		Motor m2 =   arabaFactory.createMotor();
		Sase s2 =   arabaFactory.createSase();
		Tekerlek t2 =   arabaFactory.createTekerlek();
		System.out.println(m2.getClass());
		System.out.println(s2.getClass());
		System.out.println(t2.getClass());
		
	}

}
