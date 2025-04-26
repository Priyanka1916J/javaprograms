package com.over.quest1;

public class Employee {
	
	    String name;
	    String designation;

	    // Constructor
	    public Employee(String name, String designation) {
	        this.name = name;
	        this.designation = designation;
	    }

	    // Overloaded method 1
	    void calcBonus(double basicAllowance) {
	        System.out.println(name + " (" + designation + ") gets bonus: " + basicAllowance);
	    }

	    // Overloaded method 2
	    void calcBonus(double basicAllowance, String gift) {
	        System.out.println(name + " (" + designation + ") gets bonus: " + basicAllowance + " and a gift: " + gift);
	    }

	    // Overloaded method 3
	    void calcBonus(double basicAllowance, String gift, double houseAllowance) {
	        System.out.println(name + " (" + designation + ") gets bonus: " + basicAllowance +
	                ", gift: " + gift + ", and house allowance: " + houseAllowance);
	    }
	}


