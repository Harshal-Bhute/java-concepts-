package com.day19.InterfacesRules;

/*Rule 1.*Multiple classes can implement same interface.*/

public class Rule1 {

	public static void main(String[] args) {
		duty(new Google());
		duty(new Apple());

	}
	
	static void duty(CalApp c) {
		c.add();
		c.sub();
	}

}

interface CalApp{
	
	void add();
	void sub();
	
	}

class Google implements CalApp{
	
	public void add() {
		System.out.println("This is implementation in Google class");
	}
	
	public void sub() {
		//body
	}
}

class Apple implements CalApp{
	
	public void add() {
		System.out.println("This is implementation in Apple class");
	}
	
	public void sub() {
		//body
	}
}