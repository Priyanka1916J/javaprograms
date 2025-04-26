package com.basics.quest3;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Student[] students= new Student[2];
		System.out.println("Enter the Student Details");
		for(int i=0;i<students.length;i++) {
			students[i]=new Student(scanner.next(),scanner.next());
		}
	
	students[0].printDetail();
	students[0].getGrades(new int[] {90,80,90});
	students[1].printDetail();
	int [] marks = new int[] {50,60,90};
	students[1].getGrades(marks);
	

}
}