package com.qa.java.exercises;

public class DataTypesExercise {

	public static void main(String[] args) {
		double johnSalary = 35000;

		johnSalary = johnSalary + (johnSalary * 10.5 / 100);

		System.out.println("New salary" + johnSalary);

		double apple = 3.25;
		double chickenFillets = 7.25;
		double bannana = 1.25;

		apple = apple - (apple * 10 / 100);
		chickenFillets = chickenFillets - (chickenFillets * 8 / 100);
		bannana = bannana - (bannana * 3 / 100);

		System.out.println("Apple price is:" + apple);
		System.out.println("Chicken Fillets price is:" + chickenFillets);
		System.out.println("Bannana price is:" + bannana);

	}

}
