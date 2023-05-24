package com.shristi.objbasics;

public class Vehicle {
  String model;
  int price;
  String brand;
public Vehicle(String model, int price, String brand) {
	this.model = model;
	this.price = price;
	this.brand = brand;
   }
   void getDetails()
   {
	   System.out.println("model "+model);
	   System.out.println("price "+price);
	   System.out.println("brand "+brand);
   }

}
