package com.caglartelef.creational.factorymethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Meyve meyve1=MeyveFactory.createMeyve("Elma");
		Meyve meyve2=MeyveFactory.createMeyve("Armut");
		Meyve meyve3=MeyveFactory.createMeyve("Muz");
		
		meyve1.printMeyveName();
		meyve2.printMeyveName();
		meyve3.printMeyveName();
	}

}
