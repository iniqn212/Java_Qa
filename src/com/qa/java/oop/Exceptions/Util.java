package com.qa.java.oop.Exceptions;

import com.qa.java.oop.exercises.Product;

public class Util {

	@SuppressWarnings("unused")
	static Product findById(int id) throws ProductException {

		Product monitorDell = null;

		if (monitorDell == null) {

			throw new ProductException("No found this product");
		}
		return monitorDell;
	}

	static float calculationFullPrice(float price, float priceOtherDevice, float budget) throws BudgetException {

		float sumOfDevices = price + priceOtherDevice;

		if (sumOfDevices > budget) {

			throw new BudgetException("No enough money");
		}

		return sumOfDevices;
	}

}
