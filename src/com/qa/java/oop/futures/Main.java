package com.qa.java.oop.futures;

public class Main  {

	public static void main(String[] args) {

		Audi carAudi = new Audi(100, "Audi", 80000, 4200, "Petrol", 2022, "S3", true);
		carAudi.AudiCarDetails();
		System.out.println("---------------------------------------------------");
		Bmw carBmw = new Bmw(200, "Bmw M5 Alpina", 80000, 4200, "Petrol", 2022, 8, 800);
		carBmw.CarDetails();
		
		

	}

}
