package com.caglartelef.structural.adaptor;

import java.util.ArrayList;
import java.util.List;

public class Sirket {

	private List<Calisan> calisanlarList = new ArrayList<>();

	public void elemanAl(Calisan calisan1) {
		this.calisanlarList.add(calisan1);

	}

	public void herkesCalissin() {
		for (Calisan c : this.calisanlarList) {
			c.calismayaBasla();
		}

	}

}
