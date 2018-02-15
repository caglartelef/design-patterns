package com.caglartelef.structural.decorator2;

public class SporAraba extends Araba {

	private Araba araba;

	public SporAraba(Araba araba) {
		this.araba = araba;
	}

	public void git() {
		this.araba.git();
	}

	public void hizliGit() {
		this.araba.git();
		this.araba.git();
		this.araba.git();
		this.araba.git();
	}

}
