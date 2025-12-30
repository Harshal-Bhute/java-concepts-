package Polymorphism.Rules;

public class Rule2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildA c =new ChildA();
		c.disp();

	}

}

class ParentA{
	 void disp() {
		System.out.println("the parent class method");
	}
}
class ChildA extends ParentA{
	// return type of child must be same as parent methods  
	int disp() {
		System.out.println("the child class method");
	}
} 