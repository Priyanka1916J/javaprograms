package com.shristi.methodoverloading;

public class Mobile {
	String brand, model;
	double price;
	public Mobile() {
		System.out.println("In default");
		}
	public Mobile(String model) {
		this();
		System.out.println("In one Parameter");
		this.model=model;
		/*super();
		System.out.println("In one parameter");
		this.model = model;*/
	}
	public Mobile(String model, double price) {
		this(model);
		this.price=price;
		System.out.println("In two parameter");
		/*super();
		System.out.println("In two parameter");
		this.model = model;
		this.price = price;*/
	}
	public Mobile(String brand, String model, double price) {
		this(model,price);
		this.brand = brand;
		System.out.println("In three parameter");
	/*	this.brand = brand;
		this.model = model;
		this.price = price;*/
	}
	
	void getDetails() {
		System.out.println("Mobile details");
		if(brand != null)
			System.out.println(brand);
		if(model != null)
			System.out.println(model);
		if(price>0)
			System.out.println(price);
	}
	
}
