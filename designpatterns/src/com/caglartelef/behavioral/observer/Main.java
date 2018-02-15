package com.caglartelef.behavioral.observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrafikIsigi trafikIsigi = new TrafikIsigi();

		Kamyon kamyon = new Kamyon();
		Araba araba = new Araba();
		Jeep jeep = new Jeep();
		Minibus minibus = new Minibus();

		kamyon.bak(trafikIsigi);
		araba.bak(trafikIsigi);
		jeep.bak(trafikIsigi);

		trafikIsigi.yesilOl();

		trafikIsigi.kirmiziOl();

	}

}
