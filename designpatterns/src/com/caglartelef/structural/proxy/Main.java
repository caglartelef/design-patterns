package com.caglartelef.structural.proxy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long start = System.nanoTime();
		FileProxy fileProxy = new FileProxy();
		
		String text1 = fileProxy.textOku("aaa.txt");
		//System.out.println(text1);
		long end = System.nanoTime();
		System.out.println("aaa.txt ilk okuma "+(end - start) + " ms  surdu");
		
		start  = System.nanoTime();
		String text2 = fileProxy.textOku("bbb.txt");	
		//System.out.println(text2);
		end = System.nanoTime();
		System.out.println("bbb.txt ilk okuma "+(end - start) + " ms  surdu");
		
		start  = System.nanoTime();
		String text3 = fileProxy.textOku("bbb.txt");
		//System.out.println(text3);
		end = System.nanoTime();
		System.out.println("bbb.txt ikinci okuma "+(end - start) + " ms  surdu");
		
	}

}
