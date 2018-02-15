package com.caglartelef.structural.decorator;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class LineReader extends Reader {

	private FileReader fileReader;

	public LineReader(FileReader fileReader) {
		this.fileReader = fileReader;
	}

	public String readLine() {
		String text = "";
		try {

			while (true) {
				char c = (char) this.fileReader.read();
				if (c == '\n')
					break;
				text += c;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		return super.read();
	}

}
