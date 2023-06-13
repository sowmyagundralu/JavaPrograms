package com.medicine.user.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.medicine.user.model.User;

public class UserMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user=new User();
		user.setFirstName(rs.getString("firstName"));
		user.setMiddleName(rs.getString("middleName"));
		user.setLastName(rs.getString("lastName"));
		user.setDateOfBirth(rs.getString("dateOfBirth"));
		user.setCity(rs.getString("city"));
		user.setEmail(rs.getString("email"));
		user.setSchoolName(rs.getString("schoolName"));
		user.setUserid(rs.getString("userid"));
		user.setPassword(rs.getInt("password"));
		return user;
	}
	

}
