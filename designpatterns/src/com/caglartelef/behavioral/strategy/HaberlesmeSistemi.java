package com.caglartelef.behavioral.strategy;

public class HaberlesmeSistemi {
	private Strategy strategy;

	public void kullanicilaraHaberReklamGonder() {

		System.out.println("Tum kullaniclara haber gonderiliyor");
		this.strategy.haberGonder();
		System.out.println("Tum kullanicilara haber gonderildi");
	}

	public void stratejiDegistir(Strategy strategy) {
		this.strategy = strategy;

	}
}
