package com.day20.ExceptionHandling;

import java.util.Scanner;

public class Exception1{

	public static void main(String[] args) {
		try {System.out.println("connection established");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value 1");
		int a = sc.nextInt();
		System.out.println("Enter value 2");
		int b =sc.nextInt();
		
			int c =a/b;
			System.out.println(c);
		} catch (Exception e) {
			/*e.printStackTrace();  will give the exact line and details of object e */
			System.out.println("Exception Handled");
		}
		 
		System.out.println("Connection terminated");

	} 

}
