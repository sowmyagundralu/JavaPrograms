package com.shristi.basic;
import java.util.*;
public class SmallestT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int smallest=a<b&&a<c?a:b<c?b:c;
		System.out.println("Smallest is "+smallest);
	}

}
