package com.shristi.array;

import java.util.Scanner;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
 int marks[][]=new int[3][2];
 System.out.println("populating");
 for(int i=0;i<marks.length;i++) {
	 for(int j=0;j<2;j++)
	 {
		 marks[i][j]=sc.nextInt();
	 }
 }
 System.out.println("Iterating");
 sc.close();
	}

}
