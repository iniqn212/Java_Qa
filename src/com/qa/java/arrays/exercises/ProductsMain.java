package com.qa.java.arrays.exercises;

public class ProductsMain {

	public static void main(String[] args) {
		
		//First task
		int array[] = new int[] {1,6,2,8,3,9,15,0};
		
		
		System.out.println("Sum of array elements is: " + ArrayMethod.sumArray(array));	
		System.out.println("Smallest num is: " + ArrayMethod.findSmallNum(array));
		System.out.println("Highest num is: " + ArrayMethod.findHighestNum(array));
		System.out.println("--------------GO TO SECOND TASK-----------------");
		
		//Second Task
		
		CarInShop car[] = new CarInShop[5];
		
		
		car[0] = new CarInShop("Audi", 70000f, 9.1f);
		car[1] = new CarInShop("BMW", 50000f, 8.9f);
		car[2] = new CarInShop("Mercedes", 80000f, 9.9f);
		car[3] = new CarInShop("VW", 60000f, 8.1f);
		car[4] = new CarInShop("Skoda", 40000f, 7.5f);
		
		ArrayMethod.LeastPrice(car);
		ArrayMethod.HighestPrice(car);
		ArrayMethod.HighestRaiting(car);
	}
	
	

}
