package com.shristi.basic;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int number=sc.nextInt();
	int temp=number;
	int rev=0;
    while(number!=0)
    {
    	int rem=number%10;
    	rev=rev*10+rem;
    	number/=10;
    }
    if(rev==temp)
    	System.out.println("Palindrome number");
    else
    	System.out.println("not a Palindrome number");
	}

}
