package com.caglartelef.behavioral.memento;

public class Durum {

	private int seviye;
	private int puan;
	private int altinSayisi;

	public Durum(int seviye, int puan, int altinSayisi) {
		super();
		this.seviye = seviye;
		this.puan = puan;
		this.altinSayisi = altinSayisi;
	}

	public int getSeviye() {
		return seviye;
	}

	public void setSeviye(int seviye) {
		this.seviye = seviye;
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public int getAltinSayisi() {
		return altinSayisi;
	}

	public void setAltinSayisi(int altinSayisi) {
		this.altinSayisi = altinSayisi;
	}

	@Override
	public String toString() {
		return "Durum [seviye=" + seviye + ", puan=" + puan + ", altinSayisi=" + altinSayisi + "]";
	}

}
