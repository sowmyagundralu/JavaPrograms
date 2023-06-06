package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.autowiring.ShapeFactory;
import com.example.javabased.Player;
import com.example.jbased.Student;

@SpringBootApplication
public class SpringBootBasicsApplication implements CommandLineRunner {

	ShapeFactory shapeFactory;
	
	@Autowired
	public void setShapeFactory(ShapeFactory shapeFactory) {
		this.shapeFactory = shapeFactory;
	}
	
	@Autowired
	private Student student;
	
	@Autowired
	private Player player;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicsApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		shapeFactory.printArea("r", 10, 30);
		System.out.println(student);
		//System.out.println(player);
		player.showOngoingMatches().forEach(System.out::println);
		
	}

}
