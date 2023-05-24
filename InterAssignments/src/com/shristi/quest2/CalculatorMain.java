package com.shristi.quest2;

public class CalculatorMain {

	public static void main(String[] args) {
		BasicCalculator basic=new Basic();
		basic.add(10, 40);
		basic.difference(30, 20);
		basic.product(20, 10);
		basic.divide(300, 10);
		ScientificCalculator calc=new Scientific();
		calc.square(20);
		calc.cube(7);

	}

}
