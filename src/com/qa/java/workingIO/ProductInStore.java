package com.qa.java.workingIO;

import java.io.Serializable;


@SuppressWarnings("serial")
public class ProductInStore implements Serializable {

	private int productId;
	private String productName;
	int quantity;

	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {

		if (productId < 0) {
			productId = 0;
		}
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		
		if (productName == null){
			productName = "Unknown Item";
		}
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Product [product Id=" + productId + ", product Name=" + productName + "]";
	}

}
