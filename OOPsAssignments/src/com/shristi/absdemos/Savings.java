package com.shristi.absdemos;

public class Savings extends Bank {

	public Savings(double balance) {
		super(balance);
		
	}

	@Override
	void withdraw(double amount) {
		
		balance=balance-amount;
		System.out.println("Amount is withdrawn from Savings account ");
	}

	@Override
	void deposit(double amount) {
		
		balance=balance+amount;
		System.out.println("cash is deposited to savings account \nyou got 3% interest to your account ");
	}

}
