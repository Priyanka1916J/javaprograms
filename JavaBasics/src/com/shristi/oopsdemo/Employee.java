package com.shristi.oopsdemo;

public class Employee {
	String name;
	int salary;
	Employee(){//default constructor since we are creating the default constructor java compiler won't add the cons.
		
	}

	Employee(String n, int s) {
		name = n;
		salary = s;
	}


	// Employee(){ name="Ram"; salary=1000; }

	void getDetails() {
		System.out.println("name " + name);
		System.out.println("salary " + salary);
	}

	String greet(String msg) {
		return msg;
	}
}
	

	/*public static void main(String[]
 args) { // TODO Auto-generated method stub
 
 Employee e = new Employee(); 
 System.out.println(e.name);// when we don't assign values or dot operator System.out.println(e.salary); e.name = "Ram";
 e.salary = 1200; System.out.println(e.name + " " + e.salary);
 Employee e1 = new Employee();
// e1.name = "john"; e1.salary= 1000; 
 System.out.println(e1.name+ " " + e1.salary);
 
 /*Employee e2 = e1;// both the references are pointing to the same object
  System.out.println("e2 "+ e2.name); System.out.println("e2 "+ e2.salary);
 
 e2.salary = 5000; System.out.println("e2 " +e2.salary);
 System.out.println("e1 " +e1.salary);
 
 e1 = null;// when an e1 is made to null it loses connection with the object.
 System.out.println("e2" + " " + e2.salary); //System.out.println("e1" + " " +
  e1.salary);//nullpointerexception in runtime }*/
  
 