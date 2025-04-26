package com.over.quest2;


	public class Messenger {

	    // Method 1: Only message
	    void sendMail(String message) {
	        System.out.println("Sending message: " + message);
	    }

	    // Method 2: To username + message
	    void sendMail(String toUsername, String message) {
	        System.out.println("Sending message to " + toUsername + ": " + message);
	    }

	    // Method 3: To username + message + subject
	    void sendMail(String toUsername, String message, String subject) {
	        System.out.println("Sending mail to: " + toUsername);
	        System.out.println("Subject: " + subject);
	        System.out.println("Message: " + message);
	    }
	}


