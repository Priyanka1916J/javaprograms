package com.oops.basics;

public class Productt {
	String productName;
	int price;

	public static void main(String[] args) {

		Product product = new Product();

		product.productName = "Apple";
		product.price = 100000;

		System.out.println("Product Name " + product.productName);
		System.out.println("Product price " + product.price);
		
		Product product1 = new Product();

		product1.productName = "Samsung";
		product1.price = 100000;

		System.out.println("Product Name " + product1.productName);
		System.out.println("Product price " + product1.price);
	}

}
