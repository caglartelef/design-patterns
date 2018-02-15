package com.caglartelef.structural.adaptor;

public class Calisan {
	
	private String name;

	public Calisan(String name) {
		this.name = name;
	}
	
	public Calisan() {
		super();
	}

	public void calismayaBasla()
	{
		System.out.println("Calisan "+this.name + " calismaya basladi.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
