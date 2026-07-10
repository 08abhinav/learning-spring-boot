package com.Abhinav.SpringDemo;

public class Car {
	private int battery;
	private Engine engine;
	
	public Car() {
		System.out.println("Car Object Created...");
	}
//	public Car(int battery, Engine engine) {
//		this.battery = battery;
//		this.engine = engine;
//	}
	
	public int getBattery() {
		return battery;
	}
	
	public void setBatter(int battery) {
		this.battery = battery;
	}
	
	public void getCarDetails() {
		System.out.println("Car battery: "+ battery +"%");
		System.out.println("Car running with the speed of 90km/h");
//		engine.engineSpecs();
	}
}
