package com.basics.quest5;

public class Mobile {
	 String model;
	    String brand;
	    double price;

	    public Mobile(String model, String brand, double price) {
	        this.model = model;
	        this.brand = brand;
	        this.price = price;
	    }

	  
	    void getDetails() {
	        System.out.println("Model: " + model + ", Brand: " + brand + ", Price: " + price);
	    }
	}

