package com.oops.basics;

public class EmpMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee("Vishnu",1,10000);

		/*employee.employeeName = "Vishnu";
		employee.employeeId = 20;
		employee.salary = 10000;*/
		employee.printDetails();
		employee.greetMessage("Have a Great Day Vishnu!");
		employee.calcBonus(2000);
		double bonus= employee.calcBonus(2000);
		System.out.println("Bonus "+bonus);
		
		System.out.println();
        Employee employee1 = new Employee("Lakshmi",2,10000);
		/*employee1.employeeName = "Lakshmi";
		employee1.employeeId = 10;
		employee1.salary = 10000;*/
		employee1.printDetails();
		employee1.greetMessage("Welcome Lakshmi!");
		System.out.println("Bonus "+employee1.calcBonus(2000));
		
	

	}
}
