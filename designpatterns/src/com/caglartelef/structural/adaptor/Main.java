package com.caglartelef.structural.adaptor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calisan calisan1 = new Calisan("Ahmet");
		Calisan calisan2 = new Calisan("Ali");
		Calisan calisan3 = new Calisan("Veli");
		Calisan mudur = new Mudur("Mahmut");
		Calisan takimLideri = new TakimLideri("Jack");
		
		mudur.calismayaBasla();
		
		Ressam ressam = new Ressam("Salvador Dali");
		
		Calisan c=new RessamAdaptor(ressam);
		
		c.calismayaBasla();
		

		/*Sirket sirket = new Sirket();
		sirket.elemanAl(calisan1);
		sirket.elemanAl(calisan2);
		sirket.elemanAl(calisan3);		
		sirket.elemanAl(takimLideri);
		sirket.elemanAl(mudur);

		Ressam ressam = new Ressam("Salvador Dali");

		sirket.elemanAl(new RessamAdaptor(ressam));

		sirket.herkesCalissin();*/

	}

}
