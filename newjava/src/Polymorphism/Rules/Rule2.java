package Polymorphism.Rules;

public class Rule2 {
	
	public static void main(String[] args) {
	ChildA c =new ChildA();
	c.disp2();

}
}

class ParentC{
public void disp2() {
	System.out.println("the parent class method");
}
}
class ChildC extends ParentC{
protected void disp2() {                           // will give error 
	System.out.println("the child class method");
}
}


