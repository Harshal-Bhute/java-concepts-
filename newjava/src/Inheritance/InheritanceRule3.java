package Inheritance;

//Rule No.3 constructors do not participate in inheritance

public class InheritanceRule3 {

	public static void main(String[] args) {
		Child1 c = new Child1();
	}

}
class Parent1 {
	
	public Parent1() {
		System.out.println("this is parent class constructor");
	}
}

class Child1 extends Parent1{
	public Child1() {
		System.out.println("this is child class constructor");
		
	}
}