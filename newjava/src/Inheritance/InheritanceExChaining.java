package Inheritance;

public class InheritanceExChaining {

	public static void main(String[] args) {
		ConstructorChild cc = new ConstructorChild();
		System.out.println(cc.a+ " " + cc.b);
		

	}

}

class ConstructorParent {
	int a;
	int b;
	public ConstructorParent() {
		a=10;
		a=20;
	}
	public ConstructorParent(int a,int b) {
		this.a=a;
		this.b=b;
	}
}

class ConstructorChild extends ConstructorParent {
	
	public ConstructorChild() {
		a=30;
		b=40;
	}
	public ConstructorChild(int a,int b) {
		this.a=a;
		this.b=b;
	}
} 
