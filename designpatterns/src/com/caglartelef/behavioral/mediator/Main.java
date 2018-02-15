package com.caglartelef.behavioral.mediator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gonderici gonderen = new Gonderici();

		Alici alan = new Alici();

		Postaci postaci = new Postaci(gonderen, alan);

		gonderen.mektupGonder("Selam");

	}

}
