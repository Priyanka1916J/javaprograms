package com.shristi.methodoverloading;

public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Mobile m1 = new Mobile();
		Mobile m2 = new Mobile("A123");*/
		Mobile m3 = new Mobile("B234",9000.57);
		System.out.println();
		Mobile m4 = new Mobile("C456","Samsung",67890);
		
		/*m1.getDetails();
		m2.getDetails();*/
		m4.getDetails();
		System.out.println();
		m3.getDetails();
	}

}