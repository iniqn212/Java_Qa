package com.qa.java.workingIO;

import java.util.List;

public class ProductService {

	static void displayProductInfo() {

		List<ProductInStore> product = ProductRepository.productFilePath("C://Users//iniqn//eclipse-workspace//"
				+ "Java_Exercises_QA//src//com//qa//java//workingIO//product.csv");

		for (ProductInStore item : product) {

			System.out.println(item);
		}
	}
}
