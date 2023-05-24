package com.shristi.inherdemos;

public class Savings extends Account {

	double balance=super.getBalance();
	public Savings(double balance) {
		super(balance);
		
	}

	@Override
	void withDraw(double amount) {
		balance=balance-amount;
		System.out.println("Amount is withdrawn from Savings account ");
	}

	@Override
	void deposit(double amount) {
		
		balance=balance+amount;
		System.out.println("cash is deposited to savings account \nyou got 3% interest to your account ");
	}

	@Override
	double getBalance() {
		System.out.println("Balance in savings account is....");
		return super.getBalance();
	}
	
    
}
