package com.shristi.basics;

import java.util.Scanner;

public class TowDim {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int[][] marks = new int[3][2];
			System.out.println("populating");
			for (int i = 0; i < marks.length; i++) {
				for (int j = 0; j < 2; j++) {
					marks[i][j] = sc.nextInt();
					
				}
				//System.out.print(marks[0][0]);
			}
			System.out.println("Iterating");
			for (int i = 0; i < marks.length; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.print(marks[i][j] +"\t");
				}
				System.out.println();
			}

			sc.close();

		}

	}

