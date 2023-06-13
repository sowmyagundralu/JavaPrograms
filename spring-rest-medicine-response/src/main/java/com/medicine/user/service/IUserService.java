package com.medicine.user.service;

import java.util.List;

import com.medicine.exceptions.UserNotFoundException;
import com.medicine.model.Medicine;
import com.medicine.user.model.User;
import com.medicine.user.model.UserDTO;



public interface IUserService {

	User addUser(User user);
	void updateUser(String email,int password)throws UserNotFoundException;
	void deleteUser(String userid)throws UserNotFoundException;
	
	List<User> getAll();
	User getById(String userid)throws UserNotFoundException;
	List<Medicine> getByEmailPassword(String email,int password) throws UserNotFoundException;
 
	User addUser(UserDTO userDto);
	
}
