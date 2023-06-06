package com.doctorapp.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public interface IDoctorDao {
	
	void addDoctor(Doctor doctor);
	void updateDoctor(int doctorId,double fees);
	void deleteDoctor(int doctorId);
	
	List<Doctor> findAllDoctors();
	Doctor getById(int doctorId);
	List<Doctor> findBySpeciality(String speciality);
	List<Doctor> findBySpecialityAndExp(String speciality,int experience);
	List<Doctor> findBySpecialityAndfees(String speciality,double fees);
	
	List<Doctor> findAvailabilty(LocalDateTime startTime);
}
