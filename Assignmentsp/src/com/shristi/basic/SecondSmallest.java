package com.shristi.basic;

public class SecondSmallest {

	public static void main(String[] args) {
		int a[]= {76,6,30,29,35,15,24};
		int min1=a[0];
		for(int b:a)
		{
			if(min1>b)
				min1=b;
		}
		int min2=a[0];
		for(int b:a)
		{
			if(min2>
			
			
			b&&b!=min1)
				min2=b;
		}
		System.out.println("2nd smallest is "+min2);
	}

}
