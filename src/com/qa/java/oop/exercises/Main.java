package com.qa.java.oop.exercises;

public class Main {

	public static void main(String[] args) {
		
		// Create an object 
		
		Product laptop;
		laptop = new Product(100, "Dell", 1000f, "Laptops", 9.9f, 10, true);
		
		Product monitorHp;
		monitorHp =new Product(200, "HP", 200f, "Monitors", 6.7f, 15, true);		
	
		Product smartPhone;
		smartPhone = new Product(300, "Apple", 2000f, "Phones", 10.0f, 2, true);
		
		

		laptop.displayInfo();
		float priceCut = laptop.productDiscountCalc();
		float finalPrice = laptop.priceAfterDiscount();
		System.out.println("Price of Laptop " + laptop.name + " is: " + laptop.price + "$ after discount of " + priceCut + 
				"$ final price is "+ finalPrice+"$");
		System.out.println("---------------------------------------");
		
		monitorHp.displayInfo();
		 priceCut = monitorHp.productDiscountCalc();
		 finalPrice = monitorHp.priceAfterDiscount();
		System.out.println("Price of Monitor " + monitorHp.name + " is: " + monitorHp.price + "$ after discount of " + priceCut + 
				"$ final price is "+ finalPrice+"$");
		System.out.println("---------------------------------------");
		
		smartPhone.displayInfo();
		 priceCut = smartPhone.productDiscountCalc();
		 finalPrice = smartPhone.priceAfterDiscount();
		System.out.println("Price of Phone " + smartPhone.name + " is: " + smartPhone.price + "$ after discount of " + priceCut + 
				"$ final price is "+ finalPrice+"$");
		System.out.println("---------------------------------------");
		
		Product.vendorDetails();
		
		System.out.println("---------------------------------------");
		
		

	}
}
