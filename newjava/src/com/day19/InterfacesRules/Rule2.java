package com.day19.InterfacesRules;

/*Rule2.if a class implements interface then it must provide body to all abstract method of interface*/

public class Rule2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface CalApp1{
	
	void add();
	void sub();
	
	}

class Google1 implements CalApp1{
	
	public void add() {
		//body
	}
	
	public void sub() {
		//body
	}
}

class Apple1 implements CalApp1{
	
	public void add() {
		//body
	}
	
	public void sub() {
		//body
	}
}
