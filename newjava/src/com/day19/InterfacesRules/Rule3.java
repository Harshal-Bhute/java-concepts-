package com.day19.InterfacesRules;

public class Rule3 {

	public static void main(String[] args) {
		

	}

}
interface InterfaceNo3{
	void method1();         //Rule3.it is by default  public and abstract .
	public abstract void method2();
}

class Class1 implements InterfaceNo3{
	
	public void method2(){         // for exa if we remove the visibility public then the compiler will make it default
		//body                         but as visibility of default is less than public it will show error. 
	}
	
	
	public void method1() {
		// TODO Auto-generated method stub
		
	}
}