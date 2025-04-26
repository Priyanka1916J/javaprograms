package com.basics.quest1;

public class BookMain {

	public static void main(String[] args) {
		Book book1= new Book("Ramayana", "Valmiki", "Divine", 1200);
		book1.getDetails();
		book1.checkBookType();
		
		Book book2 = new Book("Cindrella", "Charles Perrault", "Fantasy", 500);
		book2.getDetails();
		book2.checkBookType();

	}

}
