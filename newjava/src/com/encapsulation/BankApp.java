package com.encapsulation;
import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter amount to deposit :");
		Bank b = new Bank();
		int bal=sc.nextInt();//complete access
		//b.bal=sc.nextInt();
		b.setBalance(bal);
		System.out.print(" current Balance : "+b.getBalance());
		System.out.print("\nEnter amount to withdraw :");
		int w = sc.nextInt();
		int upd_bal= b.getBalance() - w;
		b.setBalance(upd_bal);
		System.out.println("Balance : "+ b.getBalance());

	}

}
class Bank{
	private int balance;
	
	public void setBalance(int bal) {  // public setter method
		if(bal>0) {
			balance = bal;
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	
	public int getBalance() {     //  public getter method
		return balance;
	}
}
