package com.caglartelef.behavioral.command;

public class RemoteControl {

	private Command command;

	public void setCommand(Command lightsOn) {
		this.command = lightsOn;

	}

	public void pressButton() {
		this.command.execute();

	}

}
