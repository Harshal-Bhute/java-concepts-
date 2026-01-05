package com.day22_Exception;
import java.util.Scanner;
public class NewBankApp {

	public static void main(String[] args) {
		UniversalBank u=new UniversalBank();
		u.banking();
	

	}

}

class UniversalBank{
	void banking() {
		Bank3 b =new Bank3();
		b.acceptInfo();
		b.verify();
	}
}

class Bank3{
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
	
	void verify() {
		if(inp==acn && upass==pass ) {
			System.out.println("login successfull");
		}else {
			InvaldInputException e =new InvaldInputException();
			System.out.println(e.getMessage());
		}
	}
	
}

class InvaldInputException extends Exception{
	public String getMessage() {
		return "Wrong credentials";
	}
}

