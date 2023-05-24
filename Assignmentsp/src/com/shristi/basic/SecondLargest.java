package com.shristi.basic;

public class SecondLargest {

	public static void main(String[] args) {
		int a[]= {10,56,30,20,45,35,64};
		int max1=a[0];
		for(int b:a)
		{
			if(max1<b)
				max1=b;
		}
		int max2=a[0];
		for(int b:a)
		{
			if(max2<b&&b!=max1)
				max2=b;
		}
		System.out.println("2nd largest is "+max2);
	}

}
