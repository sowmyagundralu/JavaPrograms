package com.example.jbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Student getStudent()
	{
		return new Student(getDepartment());
	}
	
	@Bean
	public Department getDepartment()
	{
		return new Department();
	}
	
}
