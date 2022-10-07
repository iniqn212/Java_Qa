package com.qa.java.exercises;

public class IfElseExercises {
	public static void main(String[] args) {
		
		int no;
		no = 12312;
		if (no % 2 == 0) {

			System.out.println(no + "is an even number");
		}
		else {
			System.out.println(no + " is an odd number");
		}
		
		char empDept = 'D';
		float empSalary = 30000.0f;
		byte empExp = 10;
		float incrementPercentage;
		if(empDept == 'D' && empExp > 5) {
			incrementPercentage = 10.5f;
		}
		else if(empDept == 'Q' && empExp > 5){
			incrementPercentage = 8.0f;
		}
		else {
			incrementPercentage = 5.0f;
		}
		
		float empTotalSalary;
		empTotalSalary = empSalary + ( empSalary * incrementPercentage / 100);
		System.out.println("Total Salary after incrementet : " + empTotalSalary);
		
	}
}