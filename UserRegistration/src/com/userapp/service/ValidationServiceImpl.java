package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService{

	@Override
	public boolean validateUserName(String username) throws NameExistsException {
		String[] usernames = {"sowmya","sri","praveen","siri"};
		
		for(String user:usernames)
		{
			if(user.equals(username))
			{
				throw new NameExistsException("name already exist");
			
			}
		}
		
		return true;
	
	}
	@Override
	public boolean validatePassword(String password) throws TooShortException, TooLongException {
		if(password.length()<6)
			throw new TooShortException("password is too short");
		else if(password.length()>15)
			throw new TooLongException("password is too long");
		else
		   return true;
	
	}

}
