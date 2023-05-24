package com.voterapp.main;

import com.voterapp.service.ElectionBooth;
import com.voterapp.service.ElectionBoothImpl;

public class Voter {

	public static void main(String[] args) {
		ElectionBooth election= new ElectionBoothImpl();
		try
		{
			boolean check=election.checkEligibility(18,"hyderabad",5666);
			if(check==true)
				System.out.println("Eligible to vote");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
