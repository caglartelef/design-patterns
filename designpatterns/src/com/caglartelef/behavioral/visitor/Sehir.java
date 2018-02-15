package com.caglartelef.behavioral.visitor;

public abstract class Sehir {

	private int nufus;
	private String ad;

	public Sehir(int nufus, String ad) {
		super();
		this.nufus = nufus;
		this.ad = ad;
	}

	public int accept(SehirButceVisitor sehirButceVisitor) {
		int butce = sehirButceVisitor.visit(this);
		return butce;
	}

	public int getNufus() {
		return nufus;
	}

	public void setNufus(int nufus) {
		this.nufus = nufus;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public abstract int getCarpan();

}
