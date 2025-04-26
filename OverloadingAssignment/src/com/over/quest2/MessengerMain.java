package com.over.quest2;

public class MessengerMain {
		    public static void main(String[] args) {
		        // Create object of Messenger class
		        Messenger messenger = new Messenger();

		        // Call overloaded methods with different arguments
		        messenger.sendMail("Hello, this is a general announcement!");
		        System.out.println("------------------------");

		        messenger.sendMail("alexa@example.com", "Hi Alexa, your report is ready.");
		        System.out.println("------------------------");

		        messenger.sendMail("bob@example.com", "Please find the attached invoice.", "Monthly Invoice");
		    }
		

}


