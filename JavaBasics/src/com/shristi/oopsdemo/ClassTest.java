package com.shristi.oopsdemo;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		//System.out.println(e.name);// when we don't assign values or dot operator
		//System.out.println(e.salary);
		e.name = "Ram";
		e.salary = 1200;
		e.getDetails();
		String v=e.greet(" java");
		System.out.println(v);
		//System.out.println(e.name + " " + e.salary);
		Employee e1 = new Employee();
		e1.name = "john";
		e1.salary= 1000;
		e1.getDetails();
		System.out.println(e1.greet(" back"));
		//System.out.println(e1.name + " " + e1.salary);

	}

}