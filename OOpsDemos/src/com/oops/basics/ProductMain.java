package com.oops.basics;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();

		product.productName = "Mobile";
		product.productBrand = "Apple";
		product.price = 100000;
		product.printDetails();
        //double differenceamount = product.showDiscountPrice(200);
		//System.out.println("Difference Amount " + differenceamount);
		System.out.println("Difference Amount "+product.showDiscountPrice(200) );
		System.out.println();
		Product product1 = new Product();

		product1.productName = "Mobile";
		product1.productBrand = "Samsung";
		product1.price = 100000;
		product1.printDetails();
		System.out.println("Difference Amount "+product.showDiscountPrice(500) );
		
	}

}
