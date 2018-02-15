package com.caglartelef.structural.facade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FacadeService facadeService = new FacadeService();

		facadeService.emailGonder();

		facadeService.paraGonder(1000);

	}

}
