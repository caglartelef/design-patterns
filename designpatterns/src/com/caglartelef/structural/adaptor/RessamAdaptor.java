package com.caglartelef.structural.adaptor;

public class RessamAdaptor extends Calisan {

	private Ressam ressam;

	public RessamAdaptor(Ressam ressam) {
		super();
		this.ressam = ressam;
	}

	public RessamAdaptor(String name) {
		super(name);
	}

	@Override
	public void calismayaBasla() {
		this.ressam.resimYap();
	}

}
