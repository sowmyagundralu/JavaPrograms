package com.shristi.basic;

public class Greatest {

	public static void main(String[] args) {
		int arr[]= {20,30,10,100,50,44,78,15};
		int max=arr[0];
		for(int a:arr)
		{
			if(max<a)
				max=a;
		}
       System.out.println("Greatest number is "+max);
	}

}
