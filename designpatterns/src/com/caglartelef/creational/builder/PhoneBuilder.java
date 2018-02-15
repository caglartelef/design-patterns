package com.caglartelef.creational.builder;

public abstract class PhoneBuilder {

	protected Phone phone;

	public PhoneBuilder() {
		this.phone = new Phone();
		anakartiHazirla();
		System.out.print("1-> Anakart Hazirlandi ----- ");
		memoryTak();
		System.out.print("2-> Memory Takildi ----- ");
		CPUTak();
		System.out.print("3-> CPU Takildi----- ");
		isletimSistemiKur();
		System.out.print("4-> OS Kuruldu ----- ");
		kutula();
	}

	public abstract void kutula();

	public abstract void CPUTak();

	public abstract void memoryTak();

	public abstract void isletimSistemiKur();

	public abstract void anakartiHazirla();

	public Phone getPhone() {
		return this.phone;
	}

}
