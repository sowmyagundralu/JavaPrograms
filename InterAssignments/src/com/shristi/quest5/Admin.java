package com.shristi.quest5;

import java.util.function.BiConsumer;

public class Admin {

	public static void main(String[] args) {
		
		BiConsumer<String,Integer> admin=(name,age)->
		{
			if(name.equals("admin")&&age>30)
				System.out.println("Welcome Admin");
			else
				System.out.println("wrong user");
		};
		admin.accept("admin",31);

	}

}
