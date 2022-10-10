package com.qa.java.oop.Exceptions;

import com.qa.java.oop.exercises.Product;

public class ExceptionsMethods {

	public static void main(String[] args) {

		Product monitorDell;
		float budget = 2000;
		try {
			monitorDell = Util.findById(700);
			System.out.println(monitorDell.name);
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}

		Product smartPhoneSamsung;
		smartPhoneSamsung = new Product(400, null, 1000f, "Phones", 10.0f, 2, true);
		Product smartPhoneApple;
		smartPhoneApple = new Product(500, null, 2000f, "Phones", 10.0f, 2, true);

		try {
			Util.calculationFullPrice(smartPhoneApple.price, smartPhoneSamsung.price, budget);

		} catch (BudgetException e) {

			System.out.println(e.getMessage());
		}

	}

}
