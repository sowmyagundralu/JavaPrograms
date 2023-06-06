package com.doctorapp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.IDoctorService;

@SpringBootApplication
public class SpringDoctorappJdbcApplication implements CommandLineRunner{

	@Autowired
	private IDoctorService doctorService;
	public static void main(String[] args) {
		SpringApplication.run(SpringDoctorappJdbcApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Doctor doctor = new Doctor();
		LocalDateTime starttime=LocalDateTime.of(2022,8,26,9,00);
		LocalDateTime endtime=LocalDateTime.of(2022,8,22,12,00);
		doctor.setDoctorName("shreya");
		doctor.setDoctorId(50);
		doctor.setSpeciality("dermatologist");
		doctor.setFees(1000);
		doctor.setExperience(5);
		doctor.setStartTime(starttime);
		doctor.setEndTime(endtime);
		
		doctorService.addDoctor(doctor);
		/*doctorService.updateDoctor(0, 0); //id,fees
		doctorService.deleteDoctor(0); //id
		
		System.out.println("all doctors details........................");
		doctorService.getAllDoctors()
		.stream()
		.forEach(System.out::println);
		
		
		System.out.println(" doctors details with id........................");
		System.out.println(doctorService.getById(0));
		
		
		System.out.println(" doctors details with speciality........................");
		doctorService.getBySpeciality(null)
		.stream()
        .forEach(System.out::println);	
		
		
		System.out.println(" doctors details with speciality and experience........................");
		doctorService.getBySpecialityAndExp(null, 0)
		.stream()
		.forEach(System.out::println);
		
		System.out.println(" doctors details with speciality and fees........................");
		doctorService.getBySpecialityAndfees(null, 0)
		.stream()
		.forEach(System.out::println);
		
		*/
	}
	

}
