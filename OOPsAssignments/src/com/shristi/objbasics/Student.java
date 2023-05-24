package com.shristi.objbasics;

public class Student {
   String name;
   String department;
   int id;
   public Student(String name,int id) {
	super();
	this.name = name;
	this.department = department;
    }
   void printDetails()
   {
	   System.out.println("student details are.....");
	   System.out.println("Name "+name);
	   System.out.println("id "+id);
   }
   String getGrades(int[] marks)
   {
	   int sum=0;int average=0;
	   for(int marks1:marks)
	   {
		   sum=sum+marks1;
		   average=sum/marks.length;
		   
	   }
	   if(average>=85)
		   return "grade A";
	   else if(average>=75)
		   return "grade B";
	   else
		   return "fail";
   }
}
