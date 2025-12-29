package Inheritance;

//Rule No.1

public class ParentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child p=new Child();
		System.out.println(p.a);
		System.out.println("------------------");
		p.disp();

	}

}
class Parent {
	int a=10;
	int b=20;
	void disp() {
		System.out.println(a);
		System.out.println(a);
	}
}

class Child extends Parent{

}