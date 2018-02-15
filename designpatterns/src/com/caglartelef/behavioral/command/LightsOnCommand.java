package com.caglartelef.behavioral.command;

public class LightsOnCommand extends Command {

	public LightsOnCommand(Light light) {
		this.setLight(light);
	}

	@Override
	public void execute() {
		System.out.println("Isik acik.");

	}

}
