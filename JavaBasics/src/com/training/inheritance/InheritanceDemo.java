package com.training.inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.getDetails();
		Manager manager= new Manager();
		manager.getDetails();
		manager.calcBonus(2);
		
	}

}
