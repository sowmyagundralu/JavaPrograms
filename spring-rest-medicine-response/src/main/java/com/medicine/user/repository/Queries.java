package com.medicine.user.repository;

public class Queries {

	static String insertQuery="insert into medicineuser (firstName,middleName,lastName,dateOfBirth,city,email,schoolName,userid,password)values(?,?,?,?,?,?,?,?,?)";
	static String updateQuery ="update medicineuser set password =? where email =?";
	static String deleteQuery ="delete from medicine where userid =?";
	static String getAllQuery ="select * from medicineuser";
	static String getByIdQuery ="select * from medicineuser where userid =?";
	static String getBybEmailPassword="select * from medicineuser where email=? and password=?"; 
	
}
