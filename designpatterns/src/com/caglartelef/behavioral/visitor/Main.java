package com.caglartelef.behavioral.visitor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sehir bursa = new BuyukSehir(1800000, "Bursa");
		Sehir afyonkarahisar = new NormalSehir(274000, "Afyonkarahisar");

		int bursaButce = bursa.accept(new SehirButceVisitor());
		int afyonButce = afyonkarahisar.accept(new SehirButceVisitor());

		System.out.println("Afyon butce=" + afyonButce + ", Bursa butce=" + bursaButce);
		System.out.println("Toplam butce = " + (bursaButce + afyonButce));

	}

}
