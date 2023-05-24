package com.shristi.basic;
import java.util.*;
public class Login {

	public static void main(String[] args) {
		String username[]= {"sowmya","sri","navya","siri"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username to login");
        String user=sc.nextLine();
        for(String un:username)
        {
        	if(un.equals(user))
        	{
        		System.out.println("you are logged in successfully");
        		break;
        	}
        	else
        		System.out.println("Invalid usename");
        	break;
        }
	}

}
