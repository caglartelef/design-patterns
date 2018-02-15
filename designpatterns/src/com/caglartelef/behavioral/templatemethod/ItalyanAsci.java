package com.caglartelef.behavioral.templatemethod;

public class ItalyanAsci extends Asci {

	@Override
	public void hamurAc() {
		System.out.println("Kalin Hamur acildi.");

	}

	@Override
	public void malzemeEkle() {
		System.out.println("Mozarella eklendi");
		System.out.println("Peperoni eklendi");

	}

	@Override
	public void firindaPisir() {
		System.out.println("Firinda pisirildi");

	}

}
