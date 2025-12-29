package Inheritance;

/* */

public class InheritanceEx2Chaining {

	public static void main(String[] args) {
	ConstructorChild2 cc = new ConstructorChild2(100,99);
	System.out.println(cc.a+ " " + cc.b);
	
	}

}

class ConstructorParent1 {
int a;
int b;
public ConstructorParent1() {
	this(99,99);
	a=10;
	a=20;
	System.out.println("zero parameterized parent");
}
public ConstructorParent1(int a,int b) {
	this.a=a;
	this.b=b;
	System.out.println("2 parameterized parent");
}
}

class ConstructorChild2 extends ConstructorParent1 {

public ConstructorChild2() {
	a=30;
	b=40;
	System.out.println("0 parameterized Child");
}
public ConstructorChild2(int a,int b) {
	this();
	this.a=a;
	this.b=b;
	System.out.println("2 parameterized Child");
}
} 
