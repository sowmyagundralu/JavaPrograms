package com.doctorapp.service;

import java.util.List;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public interface IDoctorService {
 
	
	void addDoctor(Doctor doctor);
	void updateDoctor(int doctorId,double fees);
	void deleteDoctor(int doctorId);
	List<Doctor> getAllDoctors();
	Doctor getById(int doctorId)throws DoctorNotFoundException;
	List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException;
	List<Doctor> getBySpecialityAndExp(String speciality,int experience)throws DoctorNotFoundException;
	List<Doctor> getBySpecialityAndfees(String speciality,double fees)throws DoctorNotFoundException;
	
	
	
	
	
	
}
