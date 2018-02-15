package com.caglartelef.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Onbasi extends Asker {

	protected List<Asker> askerler = new ArrayList<>();

	public Onbasi(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void emirUygula(String emir) {
		System.out.println(this.getName() + " : " + emir + " uygulandi!");
		for (Asker asker : this.askerler) {
			asker.emirUygula(emir);
		}
	}
}
