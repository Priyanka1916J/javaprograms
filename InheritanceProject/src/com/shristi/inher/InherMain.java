package com.shristi.inher;

public class InherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.employeeName = "Priya";
		employee.salary = 1000;
		employee.printDetails();
		
		Manager manager=new Manager();
		manager.employeeName="Shradha";
		manager.department="Admin";
		manager.salary=2000;
		manager.printDetails();
		manager.calBonus(1000);
	}

}
