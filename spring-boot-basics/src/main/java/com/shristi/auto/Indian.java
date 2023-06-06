package com.shristi.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Indian implements IFoodMenu {

	@Override
	public List<String> showItems() {
		System.out.println("indian items are....................");
		List<String> items = Arrays.asList("bajji","jelebi","laddu");
		return items;
	}

	
}
