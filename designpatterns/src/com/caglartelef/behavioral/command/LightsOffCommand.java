package com.caglartelef.behavioral.command;

public class LightsOffCommand extends Command {

	public LightsOffCommand(Light light) {
		this.setLight(light);
	}

	@Override
	public void execute() {
		System.out.println("Isik kapali.");

	}

}
