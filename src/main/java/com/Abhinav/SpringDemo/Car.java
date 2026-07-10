package com.Abhinav.SpringDemo;

public class Car {
	private int battery;
	private Engine engine;

	public int getBattery() {
		return battery;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void getCarDetails() {
		System.out.println("Car running with the speed of 90km/h");
		engine.engineSpecs();
	}
}
