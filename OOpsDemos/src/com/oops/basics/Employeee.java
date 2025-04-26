package com.oops.basics;

public class Employeee {

	String employeeName;
	int employeeId;
	double salary;

	public static void main(String[] args) {
		Employeee employee = new Employeee();
		
		System.out.println(employee.employeeName);
		System.out.println(employee.employeeId);
		System.out.println(employee.salary);

		employee.employeeName = "vishnu";
		employee.employeeId = 1;
		employee.salary = 10000;

		System.out.println("Name " + employee.employeeName);
		System.out.println("Id " + employee.employeeId);
		System.out.println("Salary " + employee.salary);

		Employeee employee1 = new Employeee();
		
		employee1.employeeName = "Lakshmi";
		employee1.employeeId = 2;
		employee1.salary = 10000;

		System.out.println("Name " + employee1.employeeName);
		System.out.println("Id " + employee1.employeeId);
		System.out.println("Salary " + employee1.salary);
	}

}
