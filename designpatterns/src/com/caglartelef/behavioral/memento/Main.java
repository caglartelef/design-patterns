package com.caglartelef.behavioral.memento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Oyun oyun = new Oyun();

		oyun.oyna();
		System.out.println(oyun);
		oyun.oyna();
		oyun.oyna();
		System.out.println(oyun);
		oyun.oyna();

		oyun.kaydet();

		oyun.oyna();
		oyun.oyna();
		oyun.kaydet();

		oyun.oyna();
		oyun.oyna();
		oyun.kaydet();

		oyun.oyna();
		oyun.oyna();

		oyun.gerial(2);

		oyun.oyna();
		oyun.kaydet();
		System.out.println(oyun);

	}

}
