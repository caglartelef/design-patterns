package com.caglartelef.behavioral.visitor;

public class SehirButceVisitor {
	public int visit(Sehir sehir) {
		int butce = sehir.getNufus() * sehir.getCarpan();

		return butce;
	}
}
