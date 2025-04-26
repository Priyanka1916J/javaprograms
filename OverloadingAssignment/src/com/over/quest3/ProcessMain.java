package com.over.quest3;
public class ProcessMain {
	    public static void main(String[] args) {
	        Processor processor = new Processor();

	        // Correct method calls with appropriate types
	        processor.calculate(25);           // int -> square
	        processor.calculate(5.0);          // double -> square root
	        processor.calculate(6, 4);         // int, int -> product
	        processor.calculate(10.5, 4.2);    // double, double -> difference
	        processor.calculate(2.0, 3);       // double, int -> power
	    }
	}


