package com.shristi.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument{

	public void play(String song) {
		
		System.out.println(song+" song is played by guitar");
	}

	
}
