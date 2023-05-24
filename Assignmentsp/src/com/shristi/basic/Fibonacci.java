package com.shristi.basic;

import java.util.Scanner;

public class Fibonacci
{
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
     int num = sc.nextInt();
     int a=0;
     int b=1;
     int fib;
      System.out.println(a);
      System.out.println(b);
      for(int i=3;i<=num;i++)
      {
    	  fib=a+b;
    	  a=b;
    	  b=fib;
    	  System.out.println(fib);
      }
 
 }
}
