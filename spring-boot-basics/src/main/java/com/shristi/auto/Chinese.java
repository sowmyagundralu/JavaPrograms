package com.shristi.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Chinese implements IFoodMenu{

	
	public List<String> showItems() {
		System.out.println("chinese items are....................");
		List<String> items = Arrays.asList("noodles,gobi,momos");
		return items;
	}

	
}
