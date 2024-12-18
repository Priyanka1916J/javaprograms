package com.shristi.basics;

public class Demo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     System.out.print("Hello\n"); //we can use \n instead of using println//
     System.out.println("Welcome to Java");
     System.out.println("\"welcome \tto Java\"");//\t represents tab space//
     
     byte x=10;
     byte y=20;
     byte c=(byte)(x+y);//downcasting//
     System.out.println(c);
     
     byte p=10;
     byte q=20;
     int r=x+y;
     System.out.println(r);
     
     int a=100;
     int b=200;
     byte z=(byte)(a+b);//Down casting//
     System.out.println(z);
     
     int s=2;//Always Local variables should be initialized otherwise it throws an error
     int t=10;
     System.out.println(s+t);
	}

}
