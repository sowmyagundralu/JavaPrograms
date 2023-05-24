package com.shristi.absdemos;

public class Current extends Bank{

	public Current(double balance) {
		super(balance);
		
	}

	@Override
	void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("Amount is withdrawn from current account ");
		
	}

	@Override
	void deposit(double amount) {
		
		balance=balance+amount;
		System.out.println("cash is deposited to current account");
	}

}
