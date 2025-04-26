package com.over.quest4;

public class GreeterMain {

	public static void main(String[] args) {
		
		        // One user, many happy messages
		        Greeter obj1 = new Greeter("Sara");
		        obj1.greetUser("Welcome", "Great day");
		        System.out.println("------------------");
		        obj1.greetUser("Good Day", "Have Tea", "Enjoy Learning");
		        System.out.println("------------------");

		        // Many users, one welcome message
		        Greeter obj2 = new Greeter();
		        obj2.sayHello("Sri", "Priya");
		        System.out.println("------------------");
		        obj2.sayHello("Sara", "Anna", "Reena", "Rohan");
		        System.out.println("------------------");
		        obj2.sayHello("Jo", "Roni");
		    }
		}

	


