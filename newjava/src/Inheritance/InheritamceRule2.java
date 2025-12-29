package Inheritance;

//Rule No.2 private members do not participate in inheritance

public class InheritamceRule2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child p=new Child();
		System.out.println(p.a);
		System.out.println("------------------");
		p.disp();

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