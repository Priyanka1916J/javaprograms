package com.over.quest3;


	public class Processor{

	    // Square root of a double
	    void calculate(double x) {
	        System.out.println("Square root of " + x + " = " + Math.sqrt(x));
	    }

	    // Product of two integers
	    void calculate(int x, int y) {
	        System.out.println("Product of " + x + " and " + y + " = " + (x * y));
	    }

	    // Difference of two doubles
	    void calculate(double x, double y) {
	        System.out.println("Difference between " + x + " and " + y + " = " + (x - y));
	    }

	    // Power of x to y
	    void calculate(double x, int y) {
	        System.out.println(x + " raised to the power of " + y + " = " + Math.pow(x, y));
	    }

	    // Square of an integer
	    void calculate(int x) {
	        System.out.println("Square of " + x + " = " + (x * x));
	    }
	}


