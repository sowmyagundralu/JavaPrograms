package com.shristi.basic;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int fact = 1;
		for(int i=num;i>=1;i--)
		{
			fact = fact*i;
		}
       System.out.println(num+"factorial is"+fact);
	}

}
