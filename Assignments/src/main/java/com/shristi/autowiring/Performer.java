package com.shristi.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Performer {

	@Autowired
	
	Instrument guitar;
	
	@Autowired
	Instrument piano;
	
	@Autowired
	Instrument violen;
	
	void playSong(String type,String song)
	{
		System.out.println("playing song.....");
		if(type.equals("Guitar"))
		guitar.play(song);
		if(type.equals("Piano"))
			piano.play(song);
		if(type.equals("Violen"))
			violen.play(song);
	}
}
