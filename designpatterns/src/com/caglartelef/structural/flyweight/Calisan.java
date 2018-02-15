package com.caglartelef.structural.flyweight;

public class Calisan {

	private String isim;

	private Sehir sehir;

	public Calisan(String isim, Sehir sehir) {
		super();
		this.isim = isim;
		this.sehir = sehir;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public Sehir getSehir() {
		return sehir;
	}

	public void setSehir(Sehir sehir) {
		this.sehir = sehir;
	}

}
