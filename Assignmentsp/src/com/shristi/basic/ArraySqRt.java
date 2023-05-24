package com.shristi.basic;
import java.util.*;
public class ArraySqRt {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter values");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		double squareRoot[]=new double[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			double sqRoot=Math.sqrt(arr[i]);
			squareRoot[i]=sqRoot;
			
		}
		System.out.println("Square root array is.....");
		for(double s:squareRoot)
		{
			System.out.println(s);
		}
	}

}
