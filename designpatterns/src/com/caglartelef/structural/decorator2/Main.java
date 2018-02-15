package com.caglartelef.structural.decorator2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Araba araba = new Araba("Siyah");
		araba.git();

		SporAraba sporAraba = new SporAraba(new Araba("Kirmizi"));

		//sporAraba.git();
		sporAraba.hizliGit();

	}

}
