package com.training.inheritance;

public class Employee {
	String name;
	int empId;

	Employee() {
		System.out.println(name + empId);
		name = "Ram";
		empId = 10;
	}

	void getDetails() {
		System.out.println("name " + name);
		System.out.println("empId " + empId);
	}
}
