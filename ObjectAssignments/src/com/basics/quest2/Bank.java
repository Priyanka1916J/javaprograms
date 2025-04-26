package com.basics.quest2;

public class Bank {
	double balance;


	public Bank(double balance) {
		super();
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("withdraw the amount "+balance);
		} else
			System.out.println("Insufficient balance");
	
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposit successful " +balance);
		} else {
			balance-=amount;
			System.out.println("Deposit not successful");
	}}
	
	public double getBalance() {

		return balance;
	}
}