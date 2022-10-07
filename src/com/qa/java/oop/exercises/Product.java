package com.qa.java.oop.exercises;

public class Product {
	
	// State
	// Instance 
	static final String VENDOR_NAME = "Argos";
	static final String CONTACT_NUMBER = "+44771234567";
	static final String VENDOR_EMAIL = "Argos@Email.com";
    int id;
    String name;
    float price;
    String category;
    float rating;
    float discountPercentage;
    boolean isAvailable;
    
    //Constructor 
    
    public Product(int id, String name, float price, String category, 
    		float rating, float discountPercentage, boolean isAvailable) {
    	
    	this.id = id;
    	this.name = name;
    	this.price = price;
    	this.category = category;
    	this.rating = rating;
    	this.discountPercentage = discountPercentage;
    	this.isAvailable = isAvailable;
    }
    
    void displayInfo() {
    	System.out.println("Product ID: "+ id);
		System.out.println("Product Name: "+ name);
		System.out.println("Product Price: "+ price + "$");
		System.out.println("Product Category: "+ category);
		System.out.println("Product Rating: "+ rating+ "/10");
		System.out.println("Product Discount: "+ discountPercentage+ "%");
		System.out.println("Product Availability: "+ isAvailable);
    }
    
    public float productDiscountCalc() {
    	
    	return (price * discountPercentage / 100);
    	
    }

	public float priceAfterDiscount() {
		
		return price - productDiscountCalc();
		
	}
	
	public static void vendorDetails() {
		
		System.out.println("Vendor name: "+ VENDOR_NAME);
		System.out.println("Vendor contact number: "+ CONTACT_NUMBER);
		System.out.println("Vendor email: "+ VENDOR_EMAIL);
	}
    
    
}
