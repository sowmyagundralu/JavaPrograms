package com.shristi.basic;
import java.util.*;
public class SmallestArr {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[8];
		System.out.println("enter values");
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
        for(int a:arr)
        {
        	if(min>a)
        		min=a;
        }
        System.out.println("smallest "+min);	
	}

}
