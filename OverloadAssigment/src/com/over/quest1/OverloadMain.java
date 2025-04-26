package com.over.quest1;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		Employee[] employees=new Employee[3];
		employees[0]=new Employee("Priyanka", "Programmer");
		employees[1]=new Employee("Sriram", "Manager");
		employees[2]=new Employee("Samskruthi","Director");
		for (int i=0;i<employees.length;i++) {
			System.out.println("employee name ="+employees[i].name);
			String employer =employees[i].designation;
			double instanceVariable=0;
			switch(employer.toUpperCase()) {
			case "PROGRAMMER":
				instanceVariable = employees[i].calcBonus(100);
				break;
			case "MANAGER":
				instanceVariable = employees[i].calcBonus(1000,200);
				break;
			case "DIRECTOR":
				instanceVariable = employees[i].calcBonus(100,1000,200);
				break;
			}
			System.out.println("InstanceVariable ="+instanceVariable);
			
		}
		
	}

	

}
