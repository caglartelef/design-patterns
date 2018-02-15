package com.caglartelef.creational.builder;

public class IPhoneBuilder extends PhoneBuilder {

	@Override
	public void kutula() {

		System.out.println("IPHONE Hazir");

	}

	@Override
	public void CPUTak() {
		this.phone.setCpu(2.3);
	}

	@Override
	public void memoryTak() {

		this.phone.setMemory(2);

	}

	@Override
	public void isletimSistemiKur() {
		this.phone.setIsletimSistemi("IOS");

	}

	@Override
	public void anakartiHazirla() {
		this.phone.setMarka("APPLE");

	}

}
