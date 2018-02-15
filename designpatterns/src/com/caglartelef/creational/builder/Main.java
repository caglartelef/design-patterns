package com.caglartelef.creational.builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PhoneBuilder pb = new IPhoneBuilder();

		Phone phone = pb.getPhone();
		System.out.println(phone);

		pb = new AndroidPhoneBuilder();

		Phone phone2 = pb.getPhone();
		System.out.println(phone2);

	}

}
