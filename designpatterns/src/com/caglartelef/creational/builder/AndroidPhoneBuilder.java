package com.caglartelef.creational.builder;

public class AndroidPhoneBuilder extends PhoneBuilder {
	@Override
	public void kutula() {

		System.out.println("HTC Hazir");

	}

	@Override
	public void CPUTak() {
		this.phone.setCpu(3.5);
	}

	@Override
	public void memoryTak() {

		this.phone.setMemory(8);

	}

	@Override
	public void isletimSistemiKur() {
		this.phone.setIsletimSistemi("Android OS");

	}

	@Override
	public void anakartiHazirla() {
		this.phone.setMarka("HTC");

	}

}
