package Polymorphism.Rules;

public class Rule1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildA c =new ChildA();
		c.disp();

	}

}

class ParentA{
	public void disp() {
		System.out.println("the parent class method");
	}
}
class ChildA extends ParentA{
	public void disp() {
		System.out.println("the child class method");
	}
} 



 
	