package com.caglartelef.behavioral.strategy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HaberlesmeSistemi haberlesmeSistemi = new HaberlesmeSistemi();

		haberlesmeSistemi.stratejiDegistir(new EmailStrategy());
		haberlesmeSistemi.kullanicilaraHaberReklamGonder();

		haberlesmeSistemi.stratejiDegistir(new SMSStrategy());
		haberlesmeSistemi.kullanicilaraHaberReklamGonder();
	}

}
