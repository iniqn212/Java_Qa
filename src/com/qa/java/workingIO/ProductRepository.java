package com.qa.java.workingIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

	String productsFilePath = "C://Users//iniqn//eclipse-workspace//"
			+ "Java_Exercises_QA//src//com//qa//java//workingIO//product.csv";

	public static List<ProductInStore> productFilePath(String productsFilePath) {
		List<ProductInStore> products = new ArrayList<ProductInStore>();

		try (BufferedReader br = new BufferedReader(new FileReader(new File(productsFilePath)))) {
			System.out.println(br.readLine());
			String productInfo = br.readLine();
			
			while (productInfo != null) {
				
				String[] splitedProductData = productInfo.split(",");
				int productId = Integer.parseInt(splitedProductData[0]);
				String productName = splitedProductData[1];
				ProductInStore product = new ProductInStore();
				product.setProductId(productId);
				product.setProductName(productName);
				products.add(product);
				
				productInfo = br.readLine();
			}
		} catch (Exception e) {

			e.printStackTrace();

		}
		return products;
	}
}
