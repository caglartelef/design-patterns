package com.caglartelef.creational.prototype;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prototip p1 = new Prototip(1, "Caglar");
		System.out.println(p1);
		try
		{
			Prototip p2 = p1.clone();
			p2.setName("Telef");
			p2.setNo(2);
			System.out.println(p2);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
