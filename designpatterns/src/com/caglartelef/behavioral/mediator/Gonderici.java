package com.caglartelef.behavioral.mediator;

public class Gonderici {

	private Postaci postaci;

	public Postaci getPostaci() {
		return postaci;
	}

	public void setPostaci(Postaci postaci) {
		this.postaci = postaci;
	}

	public void mektupGonder(String text) {
		System.out.println("GONDEREN : Mesaj Postaciya iletiliyor  --> " + text);

		postaci.aliciyaIlet(text);

	}

}
