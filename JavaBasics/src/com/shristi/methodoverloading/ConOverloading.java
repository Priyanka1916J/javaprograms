package com.shristi.methodoverloading;

public class ConOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Student s1 = new Student("Ram", 1);
		Student s2 = new Student("Ram", "Bengaluru", 2);
		s.getDetails();
		s1.getDetails();
		s2.getDetails();
	}

}
