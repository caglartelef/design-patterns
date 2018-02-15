package com.caglartelef.structural.composite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Yuzbasi yuzbasi = new Yuzbasi("Yuzbasi Ahmet");

		for (int x = 0; x < 5; x++) {
			Onbasi onbasi = new Onbasi("Onbasi " + x);
			yuzbasi.addAsker(onbasi);
			for (int i = 0; i < 10; i++) {
				Asker asker = new Asker("Asker " + i);
				onbasi.addAsker(asker);
			}
		}
		yuzbasi.emirUygula("hazir ol");

	}

}
