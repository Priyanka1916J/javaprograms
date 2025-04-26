package com.basics.quest5;

public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile1 = new Mobile("Galaxy S21", "Samsung", 70000);
		Mobile mobile2 = new Mobile("iPhone 13", "Apple", 85000);
		Mobile mobile3 = new Mobile("Galaxy M12", "Samsung", 12000);
		Mobile mobile4 = new Mobile("Nord 2", "OnePlus", 28000);
		Mobile mobile5 = new Mobile("Redmi Note 11", "Xiaomi", 15000);

		Mobile[] mobileArray = new Mobile[5];
		mobileArray[0] = mobile1;
		mobileArray[1] = mobile2;
		mobileArray[2] = mobile3;
		mobileArray[3] = mobile4;
		mobileArray[4] = mobile5;

		System.out.println("All Mobile Details:");
		for (Mobile mobile : mobileArray) {
			mobile.getDetails();
		}

		System.out.println("\nSamsung Mobiles:");
		for (Mobile mobile : mobileArray) {
			if (mobile.brand.equalsIgnoreCase("Samsung")) {
				mobile.getDetails();
			}
		}
	}

}
