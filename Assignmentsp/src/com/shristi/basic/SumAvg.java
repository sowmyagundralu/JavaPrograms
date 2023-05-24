package com.shristi.basic;

public class SumAvg
{
  public static void main(String[] args)
  {
	int arr[] = {10,20,15,30,50,6,35};
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println("sum of digits is"+sum);
	int avg=sum/arr.length;
	System.out.println("average of digits is"+avg);
  }
}
