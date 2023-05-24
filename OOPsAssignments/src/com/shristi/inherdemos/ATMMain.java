package com.shristi.inherdemos;
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
			Account account=new Savings(10000);
			switch(input1)
			{
			case 1:
			{
				account.withDraw(3000);
				
				break;
			}
			case 2:
			{
				account.deposit(2000);
				break;
			}
			case 3:
			{
				account.getBalance();
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
		Account account=new Current(50000);
		switch(input1)
		{
		case 1:
		{
			account.withDraw(1000);
			break;
		}
		case 2:
		{
			account.deposit(12000);
			break;
		}
		case 3:
		{
			account.getBalance();
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
