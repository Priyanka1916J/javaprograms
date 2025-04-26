package com.shristi.over;

public class Triangle extends Shape{
	void area(int x, int y)
	{
	 System.out.println("area"+(double)(0.5*x*y));
	   super.area(x,y);
	}
}
