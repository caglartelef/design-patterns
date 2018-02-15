package com.caglartelef.behavioral.mediator;

public class Postaci {

	private Gonderici gonderen;

	private Alici alan;

	public Postaci(Gonderici gonderen, Alici alan) {
		this.gonderen = gonderen;

		this.alan = alan;

		this.gonderen.setPostaci(this);
		this.alan.setPostaci(this);
	}

	public void aliciyaIlet(String text) {
		alan.mesalAl(text);

	}

}
