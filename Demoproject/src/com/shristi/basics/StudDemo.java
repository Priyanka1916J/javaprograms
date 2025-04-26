package com.shristi.basics;

public class StudDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks1 = 50;
		int marks2 = 60;
		int marks3 = 80;
		if (marks1 > marks2)
			System.out.println();

		int total = marks1 + marks2 + marks3;
		System.out.println("The total marks " + total);

		double avg = total / 3;
		System.out.println("Avg " + avg);
		if (avg > 60) {
			System.out.println("Grade B");
		} else if (avg < 30) {

			System.out.println("Grade C");
		}

	}
}
