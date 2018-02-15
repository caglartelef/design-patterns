package com.caglartelef.creational.factorymethod;

public class MeyveFactory {
	
	public static Meyve createMeyve(String meyveAd) {
		Meyve meyve=null;
		
		if("Elma".equalsIgnoreCase(meyveAd)) {
			meyve=new Elma();
		}else if("Armut".equalsIgnoreCase(meyveAd)) {
			meyve=new Armut();
		}else if("Muz".equalsIgnoreCase(meyveAd)) {
			meyve=new Muz();
		}
		
		return meyve;
	}

}
