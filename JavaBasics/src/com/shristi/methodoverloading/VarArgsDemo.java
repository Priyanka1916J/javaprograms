package com.shristi.methodoverloading;

public class VarArgsDemo {
	void calcSum(String name,int...marks) {
		System.out.println("Name "+name);
		System.out.println("Number of Subjects"+marks.length);
		int sum=0;
		for(int i : marks) {
		sum+=i;
	}
	System.out.println("sum "+sum);

	}
	void calcSum(String name) {
		System.out.println("Welcome "+name);
	}

	public static void main(String[] args) {
		VarArgsDemo vargs = new VarArgsDemo();
		vargs.calcSum("Ram");
		vargs.calcSum("Tom",80);
		vargs.calcSum("Jerry",80,90);
		vargs.calcSum("Rose",80,90,100);

		}
	

}
