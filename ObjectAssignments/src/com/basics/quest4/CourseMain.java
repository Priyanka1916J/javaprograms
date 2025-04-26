package com.basics.quest4;

import java.util.Scanner;
public class CourseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Enter number of trainers:");
	        int n = scanner.nextInt();
	        scanner.nextLine(); 

	        String[] trainerNames = new String[n];
	        System.out.println("Enter trainer names:");
	        for (int i = 0; i < n; i++) {
	            trainerNames[i] = scanner.nextLine();
	        }

	        Training training = new Training();

	       
	        training.showTrainers("Rohan", "Sathya");

	        
	        System.out.println("\nTrainers entered by user:");
	        training.showTrainers(trainerNames);

	        
	        System.out.println("\nAvailable Courses:");
	        String[] courses = training.showCourses();
	        for (String course : courses) {
	            System.out.println("- " + course);
	        }

	        scanner.close();
	    }
	
	

}
