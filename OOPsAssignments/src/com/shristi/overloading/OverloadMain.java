package com.shristi.overloading;
import java.util.*;
public class OverloadMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter designation");
		String designation=sc.nextLine();
		Employee employee=new Employee(name,designation);
		if(designation.equals("manager"))
           System.out.println(employee.calcBonus(300, 500));
		else if(designation.equals("programmer"))
			System.out.println(employee.calcBonus(500));
		else if(designation.equals("director"))
			System.out.println(employee.calcBonus(200, 1000, 600));
		else
			System.out.println("invalid designation");
		
	}

}
