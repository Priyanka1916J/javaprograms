package com.shristi.methodoverloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Shape();
		shape.calcArea(10);
		shape.calcArea(10.5f);
		int area = shape.calcArea(100, 200);
		System.out.println("Rect " + area);
		System.out.println("Tri " + shape.calcArea(12, 10.9f));
	}

}