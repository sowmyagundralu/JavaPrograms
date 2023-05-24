package com.shristi.basic;

public class ReversNos {

	public static void main(String[] args) {
		int a[]= {145,675,321,567,601};
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int rev=0;
			while(n!=0)
			{
				int rem = n%10;
			    rev=rev*10+rem;
			    n=n/10;
			}
			a[i]=rev;
		}
		for(int b:a)
		{
			System.out.print(b+" ");
		}
	}

}
