package Inheritance;

//Cyclic Inheritance

public class InheritanceRule6 {

	public static void main(String[] args) {
		Child5 c5 = new Child5();
		System.out.println(c5.a);
		System.out.println(c5.c);

	}

}



class Parent7 extends Child6{
	int b=100;	
}

class Child6 extends Parent7{
	int c=200;
}
