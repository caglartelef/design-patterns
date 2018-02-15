package com.caglartelef.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Asker {

	protected List<Asker> askerler = new ArrayList<>();

	private String name;

	public Asker(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addAsker(Asker asker) {
		this.askerler.add(asker);

	}

	public void emirUygula(String emir) {
		System.out.println(this.name + " : " + emir + " uygulandi!");
	}

	public List<Asker> getAskerler() {
		return askerler;
	}

	public void setAskerler(List<Asker> askerler) {
		this.askerler = askerler;
	}
}
