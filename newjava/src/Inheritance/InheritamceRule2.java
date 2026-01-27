package Inheritance;

//Rule No.2 private members do not participate in inheritance

public class InheritamceRule2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child p=new Child();
		System.out.println(p.a); // can't access a from child class object 
		System.out.println("------------------");
		p.disp();
		System.out.println(p.b);

	}

}
class Parent {
	private int a=10;
	int b=20;
	void disp() {
		System.out.println(a);
		System.out.println(a);
	}
}

class Child extends Parent{

}