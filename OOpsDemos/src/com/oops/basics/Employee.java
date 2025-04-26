package com.oops.basics;

public class Employee {
	String employeeName;
	int employeeId;
	double salary;

	/*
	 * Employee(String empl,int employeeId,double salary){ this.employeeName=empl;
	 * this.employeeId=employeeId; this.salary=salary; }
	 */
	
	public Employee(String employeeName, int employeeId, double salary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.salary = salary;
	}

	void printDetails() {
		System.out.println("Name " + employeeName);
		System.out.println("Id " + employeeId);
		System.out.println("Salary " + salary);
	}

	void greetMessage(String Message) {
		System.out.println(Message);
	}

	double calcBonus(double amount) {
		double bonus = salary + amount;
		return bonus;

	}
}
