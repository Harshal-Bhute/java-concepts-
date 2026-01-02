package com.day19.InterfacesRules;

/*An interface can extend another interface like a class extends another class along with all the methods*/

public class Rule9 {

	public static void main(String[] args) {
		

	}

}
interface NewCalc{
	void add();
	void sub();
}

interface NewCalc2 extends NewCalc{
	
	void mul();
	void div();
}

class NewCalApp implements NewCalc2{
	
   public void add() {
		
	}
   public void sub() {
		
	}
   public void mul() {
		
	}
   public void div() {
		
	}
}