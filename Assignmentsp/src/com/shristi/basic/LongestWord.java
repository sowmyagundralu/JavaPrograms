package com.shristi.basic;

public class LongestWord {

	public static void main(String[] args) {
		String s="This is a Assignment program";
		String s1[]=s.split(" ");
		int index=0;
		int max=s1[0].length();
		for(int i=0;i<s1.length;i++)
		{
			
			if(max<s1[i].length())
			{
				max=s1[i].length();
				index=i;
			}
		}
		System.out.println("longest word is "+s1[index]);
	}

}
