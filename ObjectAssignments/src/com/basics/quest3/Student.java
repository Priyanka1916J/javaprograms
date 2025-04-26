package com.basics.quest3;

public class Student {
	String Name;
	String Department;

	public Student(String name, String department) {
		super();
		this.Name = name;
		this.Department = department;
	}

	public void printDetail() {
		System.out.println("Name of the Student " + Name);
		System.out.println("From the department of " + Department);
	}

	public String getGrades(int[] marks) {
		int sum = 0;

		for (int i : marks) {
			sum += i;
		}
		System.out.println("Sum of " + sum);
		float avg = sum / marks.length;
		System.out.println("Sum of " + avg);

		if (avg >= 90) {
			return "A";
		} else if (avg >= 80) {
			return "B";
		} else if (avg >= 70) {
			return "C";
		} else if (avg >= 60) {
			return "D";
		} else if (avg >= 50) {
			return "E";
		} else {
			return "Fail";
		}
	}

}
