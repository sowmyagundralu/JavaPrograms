package com.example.javabased;

import java.util.Arrays;
import java.util.List;

public class Football implements ISports {

	@Override
	public List<String> playMatches() {
		
		return Arrays.asList("IPL","T20 matches");
	}

	
}
