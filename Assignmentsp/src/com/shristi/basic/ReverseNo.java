package com.shristi.basic;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp=num;
        int rem;
        int rev=0;
        while(num!=0)
        {
        	rem=num%10;
        	rev=rev*10+rem;
        	num/=10;
        }
        System.out.println("reverse of "+temp+"is "+rev);
	}

}
