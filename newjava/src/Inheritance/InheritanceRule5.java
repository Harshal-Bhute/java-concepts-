package Inheritance;

//Multilevel Inheritance

public class InheritanceRule5 {

	public static void main(String[] args) {
		Child5 c5 = new Child5();
		System.out.println(c5.a);
		System.out.println(c5.b);

	}

}

class GrandParent{
	int a=10;	
}

class Parent extends GrandParent{
	int b=100;	
}

class Child5 extends Parent{
	
}
