package com.userapp.client;
import java.util.*;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

public class RegisterUserMain {

	public static void main(String[] args)throws NameExistsException,TooLongException,TooShortException {
		Scanner sc=new Scanner(System.in);
		IValidationService ivalidationservice=new ValidationServiceImpl();
		System.out.println("Enter the username");
		String username=sc.nextLine();
		boolean name=ivalidationservice.validateUserName(username);
		if(name==true)
		{
			System.out.println("Enter the password");
			String passw=sc.nextLine();
			boolean pw=ivalidationservice.validatePassword(passw);
			if(pw==true)
				System.out.println("successfully registered");
		}

	}

}
