package com.caglartelef.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Calisan> cs = new ArrayList<Calisan>();
		Sehir s1 = new Sehir("Istanbul");

		for (int i = 0; i < 100; i++) {
			cs.add(new Calisan(i+". "+"Ahmet", s1));
		}
		Calisan c;
		for (int i = 0; i < 100; i++) {
			c=cs.get(i);
			System.out.println(c.getIsim());
			System.out.println(c.getSehir().getSehirIsmi());
		}
		

	}

}
