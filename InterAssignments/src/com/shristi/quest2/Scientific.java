package com.shristi.quest2;

public class Scientific extends Basic implements ScientificCalculator {

	@Override
	public void square(int x) {
		System.out.println("Square is "+(x*x));
		
	}

	@Override
	public void cube(int x) {
		System.out.println("cube is "+(x*x*x));
		
	}

}
