package com.caglartelef.structural.facade;

public class FacadeService {

	public void emailGonder() {
		new EmailService().emailGonder();
	}

	public void paraGonder(double miktar) {
		new ParaTransferService().paraGonder(miktar);
	}

}
