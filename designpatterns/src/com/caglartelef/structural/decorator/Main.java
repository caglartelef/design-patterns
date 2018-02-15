package com.caglartelef.structural.decorator;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			FileReader fReader = new FileReader("aaa.txt");
			BufferedReader bReader = new BufferedReader(fReader);

			bReader.readLine();
			fReader.read();
			bReader.read();

			LineReader rd = new LineReader(new FileReader("aaa.txt"));
			String t = rd.readLine();
			System.out.println(t);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
