package com.example.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape{

	@Override
	public void area(int x, int y) {
		System.out.println("area of Triangle"+(x*y)/2);
		
	}

	
}
