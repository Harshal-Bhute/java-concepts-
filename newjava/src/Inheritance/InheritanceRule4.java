package Inheritance;

//Rule4. Mul inheritance is not allowed in inheritance due to risk of diamond shape problem

public class InheritanceRule4 {

	public static void main(String[] args) {
	 Children c1=new Child();

	}

}
class Parent3{
	int a=10;
	public Parent3() {
		System.out.println("this is parent1 class constructor");
	}
}

class Parent4{
	int b=100;
	public Parent4() {
		System.out.println("this is parent2 class constructor");
	}
}

class Children extends Parent3,Parent4{ // syntax error
	public Children() {
		System.out.println("this is child class constructor");
	}
}