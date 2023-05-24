package com.shristi.basic;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp=num;
        int rem;
        int sum=0;
        while(num!=0)
        {
        	rem=num%10;
        	sum = sum +(rem*rem*rem);
        	num/=10;
        }
	    if(temp==sum)
	    	System.out.println("armstrong number");
	    else
	    	System.err.println("not a armstrong number");
	}

}
