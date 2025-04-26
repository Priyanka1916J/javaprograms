package com.shristi.basics;

public class Seasons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Choice = "Rainy";
		String choice = "Choice";
		switch (choice.toUpperCase()) {
		case "SUMMER":
			System.out.println("Eat ice cream and Shower twice");
			break;
		case "RAINY":
			System.out.println("Let's have samosa and coffee");
			break;
		case "WINTER":
			System.out.println("Drink soup and sleep under blanket ");
			break;
		case "Spring":
			System.out.println("Enjoy the freshness of nature");
			break;
		default:
			System.out.println("Invalid input");
			break;
	}

}}
