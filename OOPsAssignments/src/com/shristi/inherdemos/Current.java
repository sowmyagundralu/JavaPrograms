package com.shristi.inherdemos;

public class Current extends Account{
	double balance=super.getBalance();
	public Current(double balance) {
		super(balance);
		
	}

	@Override
	void withDraw(double amount) {
		balance=balance-amount;
		System.out.println("Amount is withdrawn from current account ");
	}

	@Override
	void deposit(double amount) {
		
		balance=balance+amount;
		System.out.println("cash is deposited to current account");
	}

	@Override
	double getBalance() {
		System.out.println("Balance from current account is....");
		return super.getBalance();
	}
	
}
