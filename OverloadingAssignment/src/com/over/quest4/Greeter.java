package com.over.quest4;


	public class Greeter {
	    String name;

	    
	    public Greeter() {
	    }

	   
	    public Greeter(String name) {
	        this.name = name;
	    }

	  
	    void greetUser(String... messages) {
	        for (String msg : messages) {
	            System.out.println(msg + ", " + name + "!");
	        }
	    }

	    
	    void sayHello(String... names) {
	        for (String n : names) {
	            System.out.println("Welcome, " + n + "!");
	        }
	    }
	}


