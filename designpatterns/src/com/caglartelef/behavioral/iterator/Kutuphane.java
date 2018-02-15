package com.caglartelef.behavioral.iterator;

public class Kutuphane {
	
	private Kitap[] kitaplar = new Kitap[10];
	private int index = 0;

	private int controlIndex = 0;

	public void kitapEkle(Kitap kitap) {

		this.kitaplar[index] = kitap;
		index++;
	}

	public boolean hasNext() {
		if (controlIndex >= this.kitaplar.length)
			return false;
		
		if (this.kitaplar[controlIndex] == null)
			return false;
		return true;

	}

	public Kitap nextKitap() {
		Kitap kitap = this.kitaplar[controlIndex];
		controlIndex++;
		return kitap;
	}

	public void reset() {
		this.controlIndex = 0;
	}
	
}
