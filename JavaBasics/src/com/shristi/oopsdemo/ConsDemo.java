package com.shristi.oopsdemo;

public class ConsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Ram",1200);
		e.getDetails();
		String msg = e.greet("Have a good day");
		Employee e1 = new Employee("hanuman",1000);
		//Employee e1=new Employee();
		e1.getDetails();
		System.out.println(e1.greet("Welcome to java"));
		
	}
}
