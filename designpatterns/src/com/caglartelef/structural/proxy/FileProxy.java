package com.caglartelef.structural.proxy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class FileProxy {

	public Map<String, String> cache = new HashMap<>();

	public String textOku(String fileName) {

		if (cache.containsKey(fileName)) {
			return cache.get(fileName);
		}

		String text = "";
		try {

			BufferedReader rd = new BufferedReader(new FileReader(fileName));

			while (true) {
				String line = rd.readLine();
				if (line == null) {
					break;
				}
				text += line + "\n";

			}
			//Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		cache.put(fileName, text);
		return text;
	}

}
