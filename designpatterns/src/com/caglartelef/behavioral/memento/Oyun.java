package com.caglartelef.behavioral.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Oyun {

	private List<Durum> kaydedilmisDurumlar = new ArrayList<Durum>();

	private Durum mevcutDurum = new Durum(1, 0, 0);

	public void oyna() {

		this.mevcutDurum.setSeviye(this.mevcutDurum.getSeviye() + new Random().nextInt(3));

		this.mevcutDurum.setAltinSayisi(this.mevcutDurum.getAltinSayisi() + new Random().nextInt(300));

		this.mevcutDurum.setPuan(this.mevcutDurum.getPuan() + new Random().nextInt(30));

	}

	@Override
	public String toString() {

		return this.mevcutDurum.toString();
	}

	public void kaydet() {

		int seviye = this.mevcutDurum.getSeviye();
		int puan = this.mevcutDurum.getPuan();
		int altinSayisi = this.mevcutDurum.getAltinSayisi();
		this.kaydedilmisDurumlar.add(new Durum(seviye, puan, altinSayisi));
		System.out
				.println("Oyun kaydedildi : toplam ->" + this.kaydedilmisDurumlar.size() + "  -- " + this.mevcutDurum);

	}

	public void gerial(int onceSayi) {

		System.out.println("Geri alinacak (Mevcut durum) : " + this.mevcutDurum);
		Durum gecmisDurum = this.kaydedilmisDurumlar.get(this.kaydedilmisDurumlar.size() - onceSayi);

		this.mevcutDurum.setAltinSayisi(gecmisDurum.getAltinSayisi());
		this.mevcutDurum.setPuan(gecmisDurum.getPuan());
		this.mevcutDurum.setSeviye(gecmisDurum.getSeviye());
		System.out.println("Geri alindi (Geri alindiktan sonraki durum) : " + this.mevcutDurum);

	}

}
