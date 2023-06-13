package com.medicine.user.model;

import org.springframework.stereotype.Component;

@Component
public class UserConverter {

	public UserDt toDto(User user)
	{
		UserDt userDt=new UserDt();
		userDt.setUserid(user.getUserid());
		userDt.setPassword(user.getPassword());
		
		return userDt;
		
	}
	public User toEntity(UserDTO userDto)
	{
		User user = new User();
		user.setFirstName(userDto.getFirstName());
		user.setMiddleName(userDto.getMiddleName());
		user.setLastName(userDto.getLastName());
		user.setDateOfBirth(userDto.getDateOfBirth());
		user.setCity(userDto.getCity());
		user.setEmail(userDto.getEmail());
		user.setSchoolName(userDto.getSchoolName());
		
		return user;
		
		
		
	}
}
