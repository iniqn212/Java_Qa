package com.qa.java.oop.futures;

public class Cars {

	int id;
	String name;
	float price;
	int engineCC;
	String fuelType;
	int manufacturingYear;
	
	
	public Cars(int id, String name, float price, int engineCC, String fuelType, int manufacturingYear) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.engineCC = engineCC;
		this.fuelType = fuelType;
		this.manufacturingYear = manufacturingYear;
	}
	
	public void CarDetails() {
		System.out.println("Car ID is: " + this.id);
		System.out.println("Car Name is: " + this.name);
		System.out.println("Car price is: " + this.price + "$");
		System.out.println("Car engine CC is: " + this.engineCC);
		System.out.println("Car fuel type is: " + this.fuelType);
		System.out.println("Car manufacturing year is: " + this.manufacturingYear);

	}
	
	
}
