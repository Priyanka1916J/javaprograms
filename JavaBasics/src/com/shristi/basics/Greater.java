package com.shristi.basics;

public class Greater {
public static void main(String[] args) {
	int x=500;
	int y=20;
	int z=300;
	
	/*if(x>y && x>z)
	{
	System.out.println(x);
	} else if(y>z)
	{
	  System.out.println(y);
     } else
     {
	  System.out.println(z);
	} */
	
	//Using Ternary operator
	String result = (x>y)&&(x>z)?"x is greater":y>x?"y is greater":"z is greater";
	System.out.println(result);
  }
}