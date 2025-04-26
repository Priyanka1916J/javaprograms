package com.over.quest1;

import java.util.Scanner;

public class OverloadMain {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Employee[] empArray = new Employee[5];

		        for (int i = 0; i < 5; i++) {
		            System.out.println("Enter name of employee " + (i + 1) + ":");
		            String name = scanner.nextLine();
		            System.out.println("Enter designation (Programmer / Manager / Director):");
		            String designation = scanner.nextLine();

		            
		            empArray[i] = new Employee(name, designation);

		            switch (designation.toLowerCase()) {
		                case "programmer":
		                    empArray[i].calcBonus(10000); 
		                    break;
		                case "manager":
		                    empArray[i].calcBonus(15000, "Smartwatch"); 
		                    break;
		                case "director":
		                    empArray[i].calcBonus(20000, "Laptop", 5000); 
		                    break;
		                default:
		                    System.out.println("Invalid designation entered for " + name);
		            }
		            System.out.println("---------------------------------");
		        }

		        scanner.close();
		    }
		

}


