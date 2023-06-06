package com.shristi.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Continental implements IFoodMenu{

	@Override
	public List<String> showItems() {
		System.out.println("continental items are....................");
		List<String> items = Arrays.asList("frenchfries","pizza","burger");
		return items;
	}

	
}
