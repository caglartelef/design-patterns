package com.caglartelef.behavioral.iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kutuphane kutuphane = new Kutuphane();

		for (int i = 1; i <= 10; i++) {
			kutuphane.kitapEkle(new Kitap("kitap-" + i));
		}

		while (kutuphane.hasNext()) {
			System.out.println(kutuphane.nextKitap());
		}

		kutuphane.reset();

		while (kutuphane.hasNext()) {
			System.out.println(kutuphane.nextKitap());
		}

	}

}
