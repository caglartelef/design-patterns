package com.caglartelef.behavioral.command;

public abstract class Command {

	private Light light;

	public Light getLight() {
		return light;
	}

	public void setLight(Light light) {
		this.light = light;
	}

	public abstract void execute();

}
