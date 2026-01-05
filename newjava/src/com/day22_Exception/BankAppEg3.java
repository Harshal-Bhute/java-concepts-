package com.day22_Exception;

import java.util.Scanner;

public class BankAppEg3 {

    public static void main(String[] args) {
        Bank b = new Bank();
        b.Banking();
    }
}

class Bank {

    void Banking() {
        System.out.println("Bank connection established");

        Atm card = new Atm();

        try {
            card.transaction();
        } catch (Exception e) {
            System.out.println("Your info is received, amount will be sent back shortly");
        }

        System.out.println("Bank connection terminated");
    }
}

class Atm {

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
            throw e; // rethrowing exception to Bank
        }

        System.out.println("ATM connection terminated");
    }
}
