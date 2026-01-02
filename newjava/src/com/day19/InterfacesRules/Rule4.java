package com.day19.InterfacesRules;

/*Rule4.if a class implements interface then it must provide body to all abstract method of interface but the method signature will remain the same */

public class Rule4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


interface InterfaceNo4{
	void method1();         
	public abstract void method2();
}

class Class4 implements InterfaceNo4{
	
	//public void method2(2,3){       |  
		//body                        |> Not possible 
	//}                               |
	
	
	public void method2(){          
		//body                      //right way   
	}
	
	
	public void method1() {
		// TODO Auto-generated method stub
		
	}
}