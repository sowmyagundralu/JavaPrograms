package com.shristi.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Restaurant implements CommandLineRunner {

	FoodFactory foodFactory;
	@Autowired
	public void setFoodFactory(FoodFactory foodFactory) {
		this.foodFactory = foodFactory;
	}
	public static void main(String[] args) {
		SpringApplication.run(Restaurant.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(foodFactory.displayMenu("chinese"));;
		
	}

}
