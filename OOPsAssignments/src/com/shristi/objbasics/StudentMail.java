package com.shristi.objbasics;
import java.util.*;
public class StudentMail {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter name");
	String name=sc.nextLine();
	System.out.println("Enter id");
	int id=sc.nextInt();
	Student student=new Student(name,id);
	System.out.println("Enter marks");
	int[] marks=new int[5];
	for(int i=0;i<marks.length;i++)
	{
		marks[i]=sc.nextInt();
	}
	student.printDetails();
	System.out.println(student.getGrades(marks));
	}

}
