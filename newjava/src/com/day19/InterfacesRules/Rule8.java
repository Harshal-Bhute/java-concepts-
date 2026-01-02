package com.day19.InterfacesRules;

/*a single can implement multiple interfaces multiple inheritance is not permitted in java
 *  ,however by using interface we can achieve multiple inheritance  */

public class Rule8 {

	public static void main(String[] args) {
		

	}

}
interface Calc1{
	void add();
	void sub();
}

interface Calc2{
	void mul();
	void div();
}

class CalAp1 implements Calc1,Calc2{
	
   public void add() {
		
	}
   public void sub() {
		
	}
   public void mul() {
		
	}
   public void div() {
		
	}
}