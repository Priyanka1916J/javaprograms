package com.oops.overload;

public class Vehicle {
	String model;
	String brand;
	double price;

	public Vehicle(String model) {
		super();
		this.model = model;
		
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}

	public Vehicle(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
}
