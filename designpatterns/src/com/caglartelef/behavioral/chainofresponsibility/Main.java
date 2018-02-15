package com.caglartelef.behavioral.chainofresponsibility;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TemelKazmaIsi temelKazmaIsi = new TemelKazmaIsi();		
		DuvarIsi duvarIsi = new DuvarIsi();
		CatiIsi catiIsi = new CatiIsi();	
		BoyamaIsi boyamaIsi = new BoyamaIsi();
		
		temelKazmaIsi.nextIs(duvarIsi);
		duvarIsi.nextIs(catiIsi);
		catiIsi.nextIs(boyamaIsi);
		
		temelKazmaIsi.isYap();
		
	}

}
