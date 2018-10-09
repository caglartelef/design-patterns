package com.caglartelef.creational.singleton;

public class MyClass {

	private int no;
	private String type;

	private static MyClass myInstance;// = new MyClass();

	private MyClass() {
		super();
	}

	public static MyClass getInstance() {
		if (null == myInstance) {
			synchronized (MyClass.class) {
				if (null == myInstance) {
					myInstance = new MyClass();
				}

			}
		}
		return myInstance;

	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
