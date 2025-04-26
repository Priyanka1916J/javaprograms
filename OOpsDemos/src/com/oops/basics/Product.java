package com.oops.basics;

public class Product {
	String productName;
	String productBrand;
	int price;

	void printDetails() {
		System.out.println("Product Name " + productName);
		System.out.println("Product Price " + price);
		System.out.println("Product Brand " + productBrand);
	}

	double showDiscountPrice(double discount) {
		double differenceamount = price - discount;
		return differenceamount;
	}
}
