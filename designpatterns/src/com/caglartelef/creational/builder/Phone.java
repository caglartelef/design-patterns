package com.caglartelef.creational.builder;

public class Phone {

	private String marka;
	private double cpu;
	private double memory;
	private String isletimSistemi;

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public double getMemory() {
		return memory;
	}

	public void setMemory(double memory) {
		this.memory = memory;
	}

	public String getIsletimSistemi() {
		return isletimSistemi;
	}

	public void setIsletimSistemi(String isletimSistemi) {
		this.isletimSistemi = isletimSistemi;
	}

	@Override
	public String toString() {
		return "Phone [marka=" + marka + ", cpu=" + cpu + ", memory=" + memory + ", isletimSistemi=" + isletimSistemi
				+ "]";
	}

}
