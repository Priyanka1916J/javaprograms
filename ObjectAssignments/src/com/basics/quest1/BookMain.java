package com.basics.quest1;

public class BookMain {

	public static void main(String[] args) {
		Book b = new Book("Ramayana", "Valmiki", "Divine", 1200);
		b.getDetails();
		b.checkBookType();
		
		Book b2 = new Book("Cindrella", "Charles Perrault", "Fantasy", 500);
		b2.getDetails();
		b2.checkBookType();

	}

}