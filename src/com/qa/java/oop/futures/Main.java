package com.qa.java.oop.futures;

public class Main  {

	public static void main(String[] args) {

		Audi carAudi = new Audi(100, "Audi", 80000, 4200, "Petrol", 2022, "S3", true, 40);
		carAudi.carDetails();
		System.out.println("---------------------------------------------------");
		Bmw carBmw = new Bmw(200, "Bmw M5 Alpina", 80000, 4200, "Petrol", 2022, 8, 800, 30);
		carBmw.carDetails();
		System.out.println("---------------------------------------------------");
		Audi A8 = new Audi(300, "Audi", 100000, 3200, "Petrol", 2022, "S8", false, 35);
		A8.carDetails();
		System.out.println("---------------------------------------------------");
		Volvo S40 = new Volvo(400, "Volvo S40", 50000, 2000, "Diesel", 2022, "red", 54);
		S40.carDetails();
		System.out.println("---------------------------------------------------");
		
		
	}

}
