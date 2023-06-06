package com.doctorapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.repository.IDoctorDao;

@Service
public class DoctorServiceImpl implements IDoctorService{

	IDoctorDao doctorDao;
	
	public DoctorServiceImpl(IDoctorDao doctorDao) {
		super();
		this.doctorDao = doctorDao;
	}

	@Override
	public void addDoctor(Doctor doctor) {
		doctorDao.addDoctor(doctor);
		
	}

	@Override
	public void updateDoctor(int doctorId, double fees) {
		
		doctorDao.updateDoctor(doctorId, fees);
		
	}

	@Override
	public void deleteDoctor(int doctorId) {
		
		doctorDao.deleteDoctor(doctorId);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		
		return doctorDao.findAllDoctors();
	}

	@Override
	public Doctor getById(int doctorId) throws DoctorNotFoundException {
		Doctor doctor = doctorDao.getById(doctorId);
		if(doctor==null)
			throw new DoctorNotFoundException("no such a doctor");
		return doctor;
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
		List<Doctor> doctors = doctorDao.findBySpeciality(speciality);
		if(doctors.isEmpty())
			throw new DoctorNotFoundException("no such a doctor");
		return doctors;
	}

	@Override
	public List<Doctor> getBySpecialityAndExp(String speciality, int experience)
			throws DoctorNotFoundException {
		List<Doctor> doctors = doctorDao.findBySpecialityAndExp(speciality, experience);
		if(doctors.isEmpty())
			throw new DoctorNotFoundException("no such a doctor");
		return doctors;
	}

	@Override
	public List<Doctor> getBySpecialityAndfees(String speciality, double fees)
			throws DoctorNotFoundException {
		List<Doctor> doctors = doctorDao.findBySpecialityAndfees(speciality, fees);
		if(doctors.isEmpty())
			throw new DoctorNotFoundException("no such a doctor");
		return doctors;
	}

	

	
}
