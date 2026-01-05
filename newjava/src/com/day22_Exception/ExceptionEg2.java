package com.day22_Exception;

import java.util.Scanner;

public class ExceptionEg2 {

	public static void main(String[] args) {
			System.out.println("Main connection established");
			Test13 t3=new Test13();
			try {
				 t3.gamma();
			} catch (Exception e) {
				System.out.println("Handled by main");
			}  
			System.out.println("Main connection terminated");

		}

	}
	

	class Test13{
		void gamma() throws Exception {
			System.out.println("Connection 3 established");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter value 1");
			int a=sc.nextInt();
			System.out.println("enter value 2");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
			System.out.println("Connection 3 terminated");

		}
	}