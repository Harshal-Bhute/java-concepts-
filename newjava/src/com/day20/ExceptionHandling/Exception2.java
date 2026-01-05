package com.day20.ExceptionHandling;

import java.util.Scanner;

public class Exception2{

	public static void main(String[] args) {
		
		try {System.out.println("connection established");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value 1");
		int a = sc.nextInt();
		System.out.println("Enter value 2");
		int b =sc.nextInt();
		int c =a/b;
		System.out.println(c);
		System.out.println("please enter size of array");
		int size =sc.nextInt();
		int arr[]=new int[size];
		System.out.println("plz,enter index no");
		int n =sc.nextInt();
		arr[n]=99;
		
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("please difine size within range");
			
		}catch (NegativeArraySizeException e) {
			
			System.out.println("Array size can't be negative");
		}
		
		catch (ArithmeticException e) {
			
			/*e.printStackTrace();  will give the exact line and details of object e */
			System.out.println("divide by zero not allowed");
		}
		 
		System.out.println("Connection terminated");

	} 

}
