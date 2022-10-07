package com.qa.java.arrays.exercises;

public class ArrayMethod {

	public static int sumArray(int arr[]) {
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			
		   sum = sum + arr[i];
		}
		
		return sum;
	}
	
	public static int findSmallNum(int arr[]) {
		int smallNum = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			
			int currentNum = arr[i];
			
			if(smallNum >= currentNum) {
				
				smallNum = currentNum;
			}
		}
		return smallNum;
			
	}
	
	public static int findHighestNum(int arr[]) {
		int bigNum = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			
			int currentNum = arr[i];
			
			if(bigNum <= currentNum) {
				
				bigNum = currentNum;
			}
		}
		return bigNum;
			
	}
	//-----------------------------------------------------------------task two-------------------------------------------------------
	public static void LeastPrice(CarInShop[] car) {
		
		float smallPrice = 0;
		String carModel = " ";
		
		for(CarInShop product : car) {
			
			float currentPrice = product.price;
			
			if(smallPrice == 0) {
				smallPrice = currentPrice;
			}
			if(smallPrice > currentPrice) {
				smallPrice = currentPrice;
				}
			if(smallPrice == product.price) {
				
				carModel = product.name;
			}			
		}
		System.out.println("Cheapest car in our shop is: " + carModel + " and price is: " + smallPrice+" GBP");
	}

	public static void HighestPrice(CarInShop[] car) {
		
		float bigPrice = 0.0f;
		String carModel = " ";
		
		for(CarInShop product : car) {
			
			float currentPrice = product.price;
			
			if(bigPrice == 0) {
				bigPrice = currentPrice;
			}
			if(bigPrice < currentPrice) {
				bigPrice = currentPrice;
				}
			if(bigPrice == product.price) {
				
				carModel = product.name;
			}			
		}
		System.out.println("Most expencive car in our shop is: " + carModel + " and price is: " + bigPrice+" GBP");
	}
	public static void HighestRaiting(CarInShop[] car) {
		
		float bigRaiting = 0;
		String carModel = " ";
		
		for(CarInShop product : car) {
			
			float currentRaiting = product.raiting;
			
			if(bigRaiting == 0) {
				bigRaiting = currentRaiting;
			}
			if(bigRaiting < currentRaiting) {
				bigRaiting = currentRaiting;
				}
			if(bigRaiting == product.raiting) {
				
				carModel = product.name;
			}			
		}
		System.out.println("Our highest raiting car is: " + carModel + " and raiting is: " + bigRaiting+"/10");
	}
}
