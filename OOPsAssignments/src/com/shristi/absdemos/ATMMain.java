package com.shristi.absdemos;
import java.util.*;
public class ATMMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter input\n1.savings account\n2.current account");
		int input=sc.nextInt();
		switch(input)
		{
		case 1:
		{
			System.out.println("Enter input");
			System.out.println("1.withdraw\n2.Deposit\n3.check balance");
			int input1=sc.nextInt();
			Bank bank=new Savings(20000);
			switch(input1)
			{
			case 1:
			{
				bank.withdraw(2000);
				
				break;
			}
			case 2:
			{
				bank.deposit(1000);
				break;
			}
			case 3:
			{
				bank.getbalance();
				break;
			}
			default:
				System.out.println("Enter proper input");
				
			}
			break;
		}
		
	case 2:
	{
		System.out.println("Enter input");
		System.out.println("1.withdraw\n2.Deposit\n3.check balance");
		int input1=sc.nextInt();
		Bank bank=new Current(10000);
		switch(input1)
		{
		case 1:
		{
			bank.withdraw(2000);
			break;
		}
		case 2:
		{
			bank.deposit(12000);
			break;
		}
		case 3:
		{
			bank.getbalance();
			break;
		}
		default:
			System.out.println("Enter proper input");
			
		}
		break;
	}


	}

	}
}
