package com.medicine;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.medicine.user.model.UserDTO;
import com.medicine.user.service.IUserService;
import com.medicine.user.util.CsvHelper;

@SpringBootApplication
public class SpringRestMedicineResponseApplication implements CommandLineRunner {

	public static void main(String [] args) {
		SpringApplication.run(SpringRestMedicineResponseApplication.class, args);
	}

	@Autowired
	private IUserService userService;
	
	@Autowired
	private CsvHelper csvHelper;
	@Override
	public void run(String... args) throws Exception {
		//List<UserDTO> userDtos =csvHelper.getList("users.csv");
		//userDtos.stream().forEach(userDto->userService.addUser(userDto));
		
	}

	
}
