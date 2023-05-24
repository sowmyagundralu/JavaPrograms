package com.shristi.basic;

public class SortTheArray {

	public static void main(String[] args) {
		int arr[]= {60,33,12,56,45,90,43,29};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int a:arr)
			System.out.print(a+" ");
	}

}
