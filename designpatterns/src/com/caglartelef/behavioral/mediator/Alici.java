package com.caglartelef.behavioral.mediator;

public class Alici {

	private Postaci postaci;

	public Postaci getPostaci() {
		return postaci;
	}

	public void setPostaci(Postaci postaci) {
		this.postaci = postaci;
	}

	public void mesalAl(String text) {
		System.out.println("ALAN :   Mesaj Alindi  -> " + text);

	}

}
