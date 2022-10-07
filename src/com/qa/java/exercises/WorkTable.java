package com.qa.java.exercises;

public class WorkTable {

	public static void main(String[] args) {
		
		//first 
		int number = 1234;
		int num = number;		
		int result = 0;			
		int temp = 0;
		
		
		while (num > 0) {
			temp = num % 10;
			result += temp;
			num /= 10;
		}
		System.out.println("The sum of the digits("+number+") is "+ result);
		
		
		//second
		
		
		int generalNum = 1234;
		int numOne = generalNum;
		int reverseNumOne = 0;
		temp = 0;
		
		while(numOne > 0) {
			
			temp = numOne % 10;
			reverseNumOne = reverseNumOne * 10 + temp;
			numOne /= 10;
		}
	
		System.out.println("The reverse of "+ generalNum+ " is: "+ reverseNumOne);
		
		int numTest = generalNum;
		while (numTest > 0) {
			temp = numTest % 10;
			System.out.print(temp);
			numTest /= 10;
		}
		
	}

}
