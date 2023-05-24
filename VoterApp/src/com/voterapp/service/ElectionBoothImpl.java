package com.voterapp.service;

import com.voterapp.exception.InvalidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIDException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements ElectionBooth {

	String[] localities= {"banglore","kurnool","chennai","hyderabad"};
	
	@Override
	public boolean checkEligibility(int age, String locality, int vid) throws InvalidVoterException
	{
	   
		boolean cAge=checkAge(age);
		if(cAge==true)
		{
			boolean cLoc=checkLocality(locality);
			if(cLoc==true)
			{
				boolean cVoterid=checkVoterId(vid);
			}
			else 
				throw new InvalidVoterException("not eligible to vote");
		}
		else 
			throw new InvalidVoterException("not eligible to vote");
		
		
		return true;
	}
	
	
	private boolean checkAge(int age) throws UnderAgeException {
		if(age>=18)
		{
			System.out.println("age is accepted");
		}
		else
		{
			throw new UnderAgeException("your age is not 18..it is under age");
			}
		return true;
		
		
	}
	private boolean checkLocality(String lo) throws LocalityNotFoundException
	{
		int count=0;
		for(String loc:localities)
		{
			if(lo.equals(loc)) {
				System.out.println("locality found");
				count++;break;}
		}
		if(count>0)
		return true;
		else
			throw new LocalityNotFoundException("locality is not found");
		
	}
	private boolean checkVoterId(int vid) throws NoVoterIDException {
		if(vid>=1000&&vid<=9999)
			System.out.println("voter id matched");
		else
			throw new NoVoterIDException("voter id is not matched");
		return true;
		
	}

}
