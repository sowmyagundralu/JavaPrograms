package com.shristi.quest1;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal=(x,y)->{
			System.out.println("Addition is"+(x+y));
		};
		cal.calculate(20,30);
      Calculator cal1=(x,y)->{
    	  System.out.println("Difference is "+(x-y));
      };
      cal1.calculate(50, 20);
      Calculator cal2=(x,y)->{
    	  System.out.println("product is "+(x*y));
      };
      cal2.calculate(50, 20);
      Calculator cal3=(x,y)->{
    	  System.out.println("Division is "+(x/y));
      };
      cal1.calculate(100, 20);
      
	}

}
