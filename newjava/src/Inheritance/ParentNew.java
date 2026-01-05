package Inheritance;

public class ParentNew {
/*Preference will be given to the object whatever the reference is method will be executed of the object(new Parentt()*/
	public static void main(String[] args) {
		Parentt p = new Parentt ();
		p.disp();
		Childd c=new Childd();
		c.disp();
		Parentt p1 = new Childd ();
		p1.disp();
		//Childd c1=new Parentt();
		//c1.disp();

	}

}
class Parentt{
	void disp() {
		System.out.println("this is parent method");
	}
}

class Childd extends Parentt{
	void disp() {
		System.out.println("this is child method");
	}
}