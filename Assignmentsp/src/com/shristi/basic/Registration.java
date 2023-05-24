package com.shristi.basic;
import java.util.*;
public class Registration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] username=new String[5];
		System.out.println("Enter name to register");
		int k=0;
		for(int i=0;i<username.length;i++)
		{
			 String user=sc.nextLine();
			 int count=0;
			
			 for(int j=k-1;j>=0;j--)
			 {
				 if(i==0)
				 {
					 username[i]=user;
					 k++;
					 count++;
				 }
				 else
				 {
					 
				 if(username[j].equals(user))
				 {
					 count++;
				     
				 } 
				 }
				 
			 } 
			 if(count==0)
			 {
				 username[k++]=user;
				 System.out.println("you are registered");
			 }
			 else
			 {
				 System.out.println("name is not unique");
				 i--;
			 }
			 }
			
		}

	}


