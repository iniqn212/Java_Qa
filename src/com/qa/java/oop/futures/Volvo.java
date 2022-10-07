package com.qa.java.oop.futures;

public  class Volvo extends Cars {

	String color;

	public Volvo(int id, String name, float price, int engineCC, String fuelType, int manufacturingYear, String color,
				 float petrolConsum) {
		super(id, name, price, engineCC, fuelType, manufacturingYear, petrolConsum);

		this.color = color;
	}

	public void carDetails() {

		super.carDetails();
		System.out.println("Volvo is in " + color + " color");
	}
     
	@Override
	public void engineDetails() {
		System.out.println("Volvo is safe");
		
	}
}
