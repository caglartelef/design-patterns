package com.caglartelef.creational.prototype;

public class Prototip implements Cloneable {

	private int no;
	private String name;
	
	public Prototip(int no,String name) {
		super();
		try {
			//Thread.sleep(5000);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		this.no=no;
		this.name=name;
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Prototip [no=" + no + ", name=" + name + "]";
	}

	@Override
	public Prototip clone() throws CloneNotSupportedException {
		return (Prototip) super.clone();
	}
	
}
