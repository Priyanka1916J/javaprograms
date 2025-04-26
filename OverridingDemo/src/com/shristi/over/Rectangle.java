package com.shristi.over;

public class Rectangle extends Shape {

	@Override
	 void area(int x,int y)
	 {
	   System.out.println("Area of rec is"+(double)x*y);
	   super.area(x,y);
	}

	}


