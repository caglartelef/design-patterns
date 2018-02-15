package com.caglartelef.structural.decorator2;

public class Araba {

	private String renk;

	public Araba(String renk) {
		super();
		this.renk = renk;
	}

	public Araba() {
		super();
	}

	public void git() {
		// TODO Auto-generated method stub
		System.out.println(renk+"li araba gidiyor");

	}

	@Override
	public String toString() {
		return "Araba [renk=" + renk + "]";
	}

}
