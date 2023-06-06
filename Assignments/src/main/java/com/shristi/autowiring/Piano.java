package com.shristi.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Piano implements Instrument{

	public void play(String song) {
		
		System.out.println(song+" is played by piano");
		
	}

	
}
