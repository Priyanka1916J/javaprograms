package com.training.inheritance;

public class Manager extends Employee {
	int salary;

	public Manager() {
		super();
		System.out.println(name+empId);
		name="Tom";
		empId=20;
		salary = 9000;
		

	}

	void calcBonus(int a) {
		System.out.println("Bonus " + salary * a);

	}
}