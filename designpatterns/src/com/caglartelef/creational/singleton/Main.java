package com.caglartelef.creational.singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass c1 = MyClass.getInstance();
		System.out.println(c1);
		c1.setNo(1001);
		MyClass c2 = MyClass.getInstance();
		System.out.println(c2);
		System.out.println(c2.getNo());
	}

}
