package com.caglartelef.behavioral.observer;

public class Arac {
	public void git() {
		System.out.println(this.getClass() + " gidiyor");
	}

	public void dur() {
		System.out.println(this.getClass() + " durdu");
	}

	public void bak(TrafikIsigi trafikIsigi) {
		trafikIsigi.bakanlaraEkle(this);
	}
}
