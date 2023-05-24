package com.shristi.quest4;

import java.util.function.Supplier;

public class StringUppercase {

	public static void main(String[] args) {
		
		Supplier<String> sup =()->"Sowmya".toUpperCase();
		System.out.println(sup.get());

	}

}
