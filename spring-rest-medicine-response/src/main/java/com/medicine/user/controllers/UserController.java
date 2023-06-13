package com.medicine.user.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicine.model.Medicine;
import com.medicine.user.model.User;
import com.medicine.user.model.UserConverter;
import com.medicine.user.model.UserDTO;
import com.medicine.user.model.UserDt;
import com.medicine.user.service.IUserService;



@RestController
@RequestMapping("/user-api")
public class UserController {

	private IUserService userService;
	@Autowired
	private UserConverter userConverter;

	public UserController(IUserService userService) {
		super();
		this.userService = userService;
	}
	@PostMapping("/users")
	ResponseEntity<UserDt> addUser(@RequestBody User user)
	{
		User userDetails=userService.addUser(user);
		UserDt userDt=userConverter.toDto(userDetails);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info","adding user");
		
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).body(userDt);
	}
	
	
	@PatchMapping("/users/email/{email}/password/{password}")  //write particular properties
	ResponseEntity<Void> updateUser(@PathVariable("email")String email,@PathVariable("password")int password) {
		userService.updateUser(email,password);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info","updating user");
		return ResponseEntity .accepted().build();
	}
	@DeleteMapping("/users/uid/{uid}")
	ResponseEntity<Void> deleteMedicine(@PathVariable("uid") String uid)
	{
		userService.deleteUser(uid);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info","deleting user");
		return ResponseEntity .accepted().build();
	}
	@GetMapping("/users")
	ResponseEntity<List<User>> getAll(){
		List<User> users = userService.getAll();
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info","Returning all user");
		httpHeaders.add("desc","users from database");
		ResponseEntity<List<User>> responseEntity=new ResponseEntity<List<User>>(users,httpHeaders,HttpStatus.OK);
		return responseEntity;
	}
	@GetMapping("/users/email/{email}/password/{password}")  //write particular properties
	ResponseEntity<List<Medicine>> getByEmailAndPassword(@PathVariable("email")String email,@PathVariable("password")int password) {
		List<Medicine> medicines =userService.getByEmailPassword(email, password);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info","get by email an password");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).body(medicines);
		
	}
	@GetMapping("/users/uid/{uid}")
	ResponseEntity<User> getById(@PathVariable("uid") String uid)
	{
		User user=userService.getById(uid);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info","returning a user by uid");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(user);
	}
	
}
