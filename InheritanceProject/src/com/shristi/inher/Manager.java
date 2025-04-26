package com.shristi.inher;

public class Manager extends Employee {
	String department;

	void calBonus(int amount) {
		System.out.println("Department " + department);
		System.out.println("Bonus " + (salary + amount));
	}
}

