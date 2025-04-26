package com.oops.overload;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Shape();
		shape.area(10);
		shape.area(10.0);
		int rect = shape.area(10, 20);// since it is asking for return type
		System.out.println(rect);
		float tri=shape.area(10,10.16f);
		System.out.println("Tri "+tri);
	}

}
