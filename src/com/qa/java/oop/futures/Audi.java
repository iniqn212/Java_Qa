package com.qa.java.oop.futures;

public class Audi extends Cars {
	
	String model;
	boolean isAvailable;
	
	public Audi(int id, String name, float price, int engineCC, String fuelType, int manufacturingYear,
			String model, boolean isAvailable) {
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.model = model;
		this.isAvailable = isAvailable;
	}
	
	
	void AudiCarDetails(){
		
		CarDetails();
		System.out.println("Car Model is: " + model);
		
		String availability = "";
		if(isAvailable) {
			availability = "available";
		}
		else {
			availability = "not available";
		}
		System.out.println(name + " " + model + " is " + availability + " for purchase!");
	}
	
	
	
	
}
