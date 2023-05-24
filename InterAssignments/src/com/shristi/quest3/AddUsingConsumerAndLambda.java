package com.shristi.quest3;

import java.util.function.BiConsumer;

public class AddUsingConsumerAndLambda {

	public static void main(String[] args) {
		BiConsumer<Integer,Integer> add=(num1,num2)->System.out.println("addition is "+(num1+num2));
        add.accept(20, 30);
	}

}
