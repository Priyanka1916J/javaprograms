package com.training.inheritance;

public class ModifiedManager extends ModifyedEmployee {
	int salary;
	public ModifiedManager(String name,int empId,int salary) {
		super(name,empId);
		System.out.println(this.name + this.empId);
		
		this.salary = salary;

	}

	void calcBonus(int a) {
		System.out.println("Bonus " + salary * a);

	}
}
