package com.caglartelef.behavioral.templatemethod;

public abstract class Asci {

	public abstract void hamurAc();

	public abstract void malzemeEkle();

	public abstract void firindaPisir();

	public final void pizzaYap() {
		hamurAc();
		malzemeEkle();
		firindaPisir();
	}

}
