package com.basics.quest1;

public class Book {
	String title;
	String author;
	String category;
	int price;

	Book(String t, String a, String c, int p) {
		title = t;
		author = a;
		category = c;
		price = p;

	}

	void getDetails() {
		System.out.println("Title - " + title);
		System.out.println("Author - " + author);
		System.out.println("Category - " + category);
		System.out.println("Price - "+"Rs."+price+"/-");
	}

	void checkBookType() {
		if (price > 500) {
			System.out.println("Premiun Book");
		} else
			System.out.println("Standard Book");

	}
}
