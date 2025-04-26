package com.over.quest3;

public class ProcessorMain {

	public static void main(String[] args) {
		Processor processor=new Processor();
		int x=20;
		int y=40;
		double a=30.00;
		double b=10.60;
		
		processor.calculate(x);
	
		processor.calculate(a);
		
		processor.calculate(a, b);
		
		processor.calculate(x, y);
		
		processor.calculate(a, y);
	}
	

}
