package com.caglartelef.behavioral.templatemethod;

public class MeksikaliAsci extends Asci {

	@Override
	public void hamurAc() {
		System.out.println("Ince Hamur acildi.");

	}

	@Override
	public void malzemeEkle() {
		System.out.println("Lor eklendi");
		System.out.println("Jalepeno biberi eklendi");
		System.out.println("Sumak eklendi");

	}

	@Override
	public void firindaPisir() {
		System.out.println("Odun firininda pisirildi");

	}

}
