package com.shristi.overloading;

public class Employee {
   String name;
   String designation;
   
   public Employee(String name, String designation) {
	this.name = name;
	this.designation = designation;
   }
  double calcBonus(double basicAllowance)
   {
	   System.out.println("Bonus is....");
	   double bonus=basicAllowance+1000;
	   return bonus;
   }
   double calcBonus(double basicAllowance,double carAllowance)
   {
	   System.out.println("Bonus is....");
	    double bonus=(basicAllowance+carAllowance)*10;
	    return bonus;
   }
   double calcBonus(double basicAllowance,double carAllowance,double housingAllowance)
   {
	   System.out.println("Bonus is.....");
	   double bonus=basicAllowance+carAllowance+housingAllowance+1500;
	   return bonus;
   }
}
