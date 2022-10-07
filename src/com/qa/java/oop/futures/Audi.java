package com.qa.java.oop.futures;

public   class Audi extends Cars {
	
	String model;
	boolean isAvailable;
		
	public Audi(int id, String name, float price, int engineCC, String fuelType, 
			    int manufacturingYear,String model, boolean isAvailable, float petrolConsum) {
		super(id, name, price, engineCC, fuelType, manufacturingYear, petrolConsum);
		this.model = model;
		this.isAvailable = isAvailable;
	}
	
	public void carDetails() {
		
		super.carDetails();
		
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
	
	@Override
	public void engineDetails() {
		
		System.out.println("Car Audi have powerfull engine");
	}
	
	
	
	
}
