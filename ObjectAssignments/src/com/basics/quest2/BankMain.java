package com.basics.quest2;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 to deposit the Amount");
	System.out.println("Enter 2 to withdraw the Amount");
	System.out.println("Enter 3 to getbalance the Amount");
	int choice=sc.nextInt();
	Bank bank= new Bank(50000.0);
	switch(choice)
	{
		case 1:System.out.println("Deposit the amount");
		bank.deposit(sc.nextDouble());
		break;
		case 2:System.out.println("withdraw");
		bank.withdraw(sc.nextDouble());
		break;
		case 3:System.out.println("Balance "+bank.getBalance());
		double balance=bank.getBalance();
		break;
		default:System.out.println("Invaild");
		break;
	}
  }
}
