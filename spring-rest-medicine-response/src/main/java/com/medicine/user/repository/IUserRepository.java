package com.medicine.user.repository;

import java.util.List;

import com.medicine.exceptions.UserNotFoundException;
import com.medicine.model.Medicine;
import com.medicine.user.model.User;



public interface IUserRepository {

	User addUser(User user);
	void updateUser(String email,int password)throws UserNotFoundException;
	void deleteUser(String userid)throws UserNotFoundException;
	
	List<User> findAll();
	User findById(String userid) throws UserNotFoundException;
	List<Medicine> findByEmailPassword(String email,int password)throws UserNotFoundException;
 
}
