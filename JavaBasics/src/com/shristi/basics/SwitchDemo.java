package com.shristi.basics;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String fruit = "BLACKGRAPES";
switch(fruit.toUpperCase()) {
   
case "APPLE":
System.out.println("An Apple a day, keeps doctor away");
break;
case "GRAPES":
case "BLACKGRAPES":
System.out.println("Grapes was delicious");
System.out.println("Blackgrapes good for gut");
break;
case "ORANGE":
System.out.println("we get vitamin C from Orange");
break;
case "default":
System.out.println("Invalid");
break;

	}*/
		
		String Season ="winter"; 
		switch(Season.toLowerCase()){
		case "summer":
			System.out.println("Lets eat ice cream");
			break;
			
		case "winter":
			System.out.println("Lets drink soup");
			break;
		case "rainy":
			System.out.println("Lets drink tea");
			break;
		case "autunm":
			System.out.println("Enjoy the wind");
			break;	
		case "default":
			System.out.println("Invalid");
			break;
			
			
			
			
		}
	}
}
