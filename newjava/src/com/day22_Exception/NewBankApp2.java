package com.day22_Exception;
import java.util.Scanner;

public class NewBankApp2 {

	public static void main(String[] args) {
		UniversalBank1 u=new UniversalBank1();
		u.banking();
	

	}

}

class UniversalBank1{
	void banking() {
		Bank4 b =new Bank4();
		try {
			b.acceptInfo();
			b.verify();
		} catch (Exception e) {
			System.out.println("Wrong pin");
			System.out.println("attempt 2");
			
			try {
				b.acceptInfo();
				b.verify();
			} catch (InvaldInputException1 e1) {
				System.out.println("Wrong pin");
				System.out.println("last attempt");
			}
			try {
				b.acceptInfo();
				b.verify();
			} catch (InvaldInputException1 e1) {
				System.out.println("Wrong pin");
				System.out.println("Atm is blocked");
			}
		}
	}
}

class Bank4{
	int acn=100;
	int pass = 1234;
	int inp;
	int upass;
	
	 void acceptInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the acc num :");
		 inp=sc.nextInt();
		System.out.print("Enter the pass :");
		  upass=sc.nextInt();
	}
	
	void verify() throws InvaldInputException1 {
		if(inp==acn && upass==pass ) {
			System.out.println("login successfull");
		}else {
			InvaldInputException1 e =new InvaldInputException1();
			throw e;
		}
	}
	
}

class InvaldInputException1 extends Exception{
	public String getMessage() {
		return "Wrong credentials";
	}
}

