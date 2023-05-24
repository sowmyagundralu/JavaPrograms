package com.shristi.basic;
import java.util.*;
public class SumAverage {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter values");
	int a[]=new int[5];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();	
	}
   System.out.println("sum is");
   int sum=0;
   for(int arr:a)
   {
	 sum=sum+arr;
   }
   System.out.println(sum);
   System.out.println("Average is");
   int average=sum/a.length;
   System.out.println(average);
	
	
	
  }
}
