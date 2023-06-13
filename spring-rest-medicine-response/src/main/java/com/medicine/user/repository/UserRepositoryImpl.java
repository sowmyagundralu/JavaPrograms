package com.medicine.user.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.medicine.exceptions.UserNotFoundException;
import com.medicine.model.Medicine;
import com.medicine.service.IMedicineService;
import com.medicine.user.model.User;
@Repository
public class UserRepositoryImpl implements IUserRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private IMedicineService medicineService;
	@Override
	public User addUser(User user) {
		
	  Object userArray[]= {user.getFirstName(),user.getMiddleName(),user.getLastName(),user.getDateOfBirth(),user.getCity(),user.getEmail(),user.getSchoolName(),user.getUserid(),user.getPassword()};
	  jdbcTemplate.update(Queries.insertQuery,userArray);	
		
	  return user;
	}

	@Override
	public void updateUser(String email, int password)throws UserNotFoundException {
		
		jdbcTemplate.update(Queries.updateQuery,password,email);
	}

	@Override
	public void deleteUser(String userid)throws UserNotFoundException {
		
		jdbcTemplate.update(Queries.deleteQuery,userid);
		
	}

	@Override
	public List<User> findAll() {
		
		return jdbcTemplate.query(Queries.getAllQuery, new UserMapper());
	}

	@Override
	public User findById(String userid)throws UserNotFoundException {

		
		try
		{
			User user =jdbcTemplate.queryForObject(Queries.getByIdQuery, new UserMapper(),userid);
			return user;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}

	@Override
	public List<Medicine> findByEmailPassword(String email, int password) {
		User user=jdbcTemplate.queryForObject(Queries.getBybEmailPassword, new UserMapper(),email,password);
		User nuser=Optional.of(user)
				.orElseThrow(()->new UserNotFoundException("no user with that email and password"));
		return medicineService.getAll() ;
	}
	

	
}
