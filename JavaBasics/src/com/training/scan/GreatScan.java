package com.training.scan;

import java.util.Scanner;

public class GreatScan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		int n2 = sc.nextInt();
		System.out.println("Enter 3rd number");
		int n3 = sc.nextInt();

		if (n1 > n2)
			if (n1 > n3) {
				System.out.println("n1 is greater " + n1);
			}
		if (n2 > n1)
			if (n2 > n3) {
				System.out.println("n2 is greater  " + n2);

			}
		if (n3 > n1)
			if (n3 > n2) {
				System.out.println("n3 is greater " + n3);
			}

	}
}
