package com.caglartelef.behavioral.command;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteControl control = new RemoteControl();
	    Light light = new Light();

	    Command lightsOn = new LightsOnCommand(light);
	    Command lightsOff = new LightsOffCommand(light);

	    //switch on

	    control.setCommand(lightsOn);
	    control.pressButton();

	    //switch off
	    control.setCommand(lightsOff);
	    control.pressButton();
		
	}

}
