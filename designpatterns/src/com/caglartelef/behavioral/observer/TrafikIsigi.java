package com.caglartelef.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class TrafikIsigi {

	private List<Arac> isigaBakanlar = new ArrayList<>();

	public void bakanlaraEkle(Arac arac) {

		this.isigaBakanlar.add(arac);

	}

	public void yesilOl() {

		for (Arac arac : this.isigaBakanlar) {
			arac.git();
		}

	}

	public void kirmiziOl() {
		for (Arac arac : this.isigaBakanlar) {
			arac.dur();
		}

	}

}
