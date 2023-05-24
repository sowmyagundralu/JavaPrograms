package com.shristi.basic;

public class MaxOccurence {

	public static void main(String[] args) {
		String str="assignments";
		char str1[]=str.toCharArray();
		int max=0;int k=0;
		for(int i =0;i<str1.length;i++)
		{
			int count=1;
			for(int j=i+1;j<str1.length;j++)
			{
				if(str1[i]==str1[j])
				{
					count++;
				}
			}
				if(max<count)
				{
					max=count;
					k=i;
				}
			
		}
		System.out.println("maximum occurence is "+str1[k]+" "+max+" times");
		
	}

}
