package com.shristi.basics;

public class TypeCastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=100;
long y=x;//upcasting
double a=y*2;
System.out.println(a);

//downcasting
float val=(float)a;
int num=(int) val;
System.out.println(num);

	}

}
