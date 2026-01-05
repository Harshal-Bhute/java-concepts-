package com.day22_Exception;

import java.util.Scanner;

public class BankAppeg4 {

	public static void main(String[] args) {
	        Bank1 b = new Bank1();
	        b.Banking();
	    }
	}

	class Bank1 {

	    void Banking() {
	        System.out.println("Bank connection established");

	        Atm1 card = new Atm1();

	        try {
	            card.transaction();
	        } catch (Exception e) {
	            System.out.println("Your info is received, amount will be sent back shortly");
	        }

	        System.out.println("Bank connection terminated");
	    }
	}

	class Atm1 {

	    void transaction() throws Exception {
	        System.out.println("ATM connection established");

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter value 1");
	        int a = sc.nextInt();

	        System.out.println("Enter value 2");
	        int b = sc.nextInt();

	        try {
	            int c = a / b;
	            System.out.println("Result: " + c);
	        } catch (Exception e) {
	            System.out.println("Exception handled by ATM");
	            throw e; 
	        }
	        finally {

	        System.out.println("ATM connection terminated");
	        }
	    }
	}
