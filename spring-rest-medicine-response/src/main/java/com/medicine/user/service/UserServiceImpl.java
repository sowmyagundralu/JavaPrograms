package com.medicine.user.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicine.exceptions.UserNotFoundException;
import com.medicine.model.Medicine;
import com.medicine.user.model.User;
import com.medicine.user.model.UserConverter;
import com.medicine.user.model.UserDTO;
import com.medicine.user.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService{

	static int i=0;
	@Autowired
	private IUserRepository userRepository;
	
	@Autowired
	private UserConverter userConverter;
	
	@Override
    public User addUser(User user) {
		
		String uid =generateUid(user);
		User nuser=getById(uid);
		User userDetails;
		if(nuser==null)
		{
			int password = generatePassword();
			user.setUserid(uid);
			user.setPassword(password);
			userDetails=userRepository.addUser(user);
		}
		else
			
		{
			uid =regenerateUid(user);	
			int password = generatePassword();
			user.setUserid(uid);
			user.setPassword(password);
			userDetails=userRepository.addUser(user);
		}
		return userDetails;
	}

	@Override
	public void updateUser(String email, int password)throws UserNotFoundException {
		
		userRepository.updateUser(email, password);
	}

	@Override
	public void deleteUser(String userid)throws UserNotFoundException {
		
		userRepository.deleteUser(userid);
	}

	@Override
	public List<User> getAll() {
		
		return userRepository.findAll();
	}

	@Override
	public User getById(String userid) throws UserNotFoundException {
		
		User user= userRepository.findById(userid);
				
				
		return user;
	}

	@Override
	public List<Medicine> getByEmailPassword(String email, int password) throws UserNotFoundException {
		
		List<Medicine> medicine = userRepository.findByEmailPassword(email, password);
		if(medicine.isEmpty())
			throw new UserNotFoundException("user not matched");
		return medicine;
	}
	
	public String generateUid(User user)
	{
		String fname=user.getFirstName();
	    String mname=user.getMiddleName();
		String lname=user.getLastName();
		String city =user.getCity();
		String uid;
		uid = city.substring(0, 2)+fname.charAt(0)+mname.charAt(0)+lname.charAt(0)+(i++);
		if(i==9)
			i=0;
		return uid;
	}
	public int generatePassword()
	{
		int password =0;
		Random random =new Random();
		for(int i=1;i<=4;i++)
		{
			int k=random.nextInt(9);
			password=password*10+k;
		}
		return password;
	}
	public String regenerateUid(User user)
	{
		String fname=user.getFirstName();
	    String mname=user.getMiddleName();
		String lname=user.getLastName();
		String city =user.getCity();
		String uid;
		uid = fname.charAt(0)+city.substring(0, 2)+mname.charAt(0)+lname.charAt(0)+(i++);
		if(i==9)
			i=0;
		return uid;
	}

	@Override
	public User addUser(UserDTO userDto) {
		
		User user=userConverter.toEntity(userDto);
		String uid =generateUid(user);
		User nuser=getById(uid);
		User userDetails;
		if(nuser==null)
		{
			int password = generatePassword();
			user.setUserid(uid);
			user.setPassword(password);
			userDetails=userRepository.addUser(user);
		}
		else
			
		{
			uid =regenerateUid(user);	
			int password = generatePassword();
			user.setUserid(uid);
			user.setPassword(password);
			userDetails=userRepository.addUser(user);
		}
		return userDetails;
		
	}
	
	
}
