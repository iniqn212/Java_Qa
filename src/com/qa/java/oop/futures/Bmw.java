package com.qa.java.oop.futures;

public class Bmw extends Cars {

	int noOfCylinders;
	int maxTorque;
	
	public Bmw(int id, String name, float price, int engineCC, String fuelType, int manufacturingYear,
			int noOfCylinders, int maxTorque) {
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.noOfCylinders = noOfCylinders;
		this.maxTorque = maxTorque;
	}
	
	public void CarDetails() {
		
		super.CarDetails();
		System.out.println("Bmw has " + noOfCylinders + " cylinders");
		System.out.println("Bmw has max torque of " + maxTorque +" Nm" );
	}
}
