package Day19.Interface;
import java.util.Scanner;
public class CodCalcApp {

	public static void main(String[] args) {
		
		duty(new RupeshInfotech());
		System.out.println("<<<<<<<<<<<<<<<<<<<<Next class>>>>>>>>>>>>>>>>>>>>>>");
		duty(new RajInfotech());

	}
	
	static void duty(CodCalc c ) {
		c.add();
		c.sub();
		c.mul();
		c.div();
	}

}

class RupeshInfotech implements CodCalc{
	
	public void add() {
		int a=10;
		int b=2;
		int c=a+b;
		System.out.println("Addition is :"+c);	
	}
	
    public void sub() {
    	int a=10;
		int b=2;
		int c=a-b;
		System.out.println("Substraction is :"+c);
	}
    public void mul() {
    	int a=10;
		int b=2;
		int c=a*b;
		System.out.println("Mulplication is :"+c);
	
    }
    
    public void div() {
    	int a=10;
		int b=2;
		int c=a/b;
		System.out.println("Division is :"+c);
    }
	
}

class RajInfotech implements CodCalc{
	
	Scanner sc = new Scanner (System.in);
	
	

	public void add() {
		System.out.println("Welcome to add method");
		System.out.print("Input value of a :");
		int a =sc.nextInt();
		System.out.print("Input value of b :");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Ans."+c);
	}
	
    public void sub() {
    	System.out.println("Welcome to sub method");
    	System.out.println("Input value of a");
    	int a =sc.nextInt();
    	System.out.println("Input value of b");
    	int b=sc.nextInt();
    	int c=a-b;
    	System.out.println("Ans."+c);
	}
    public void mul() {
    	System.out.println("Welcome to multiplication method");
    	System.out.print("Input value of a :");
    	int a =sc.nextInt();
    	System.out.print("Input value of b :");
    	int b=sc.nextInt();
    	int c=a*b;
    	System.out.println("Ans."+c);
}
    public void div() {
    	System.out.println("Welcome to division method");
    	System.out.print("Input value of a :");
    	int a =sc.nextInt();
    	System.out.print("Input value of b :");
    	int b=sc.nextInt();
    	int c=a/b;
    	System.out.println("Ans."+c);
}
	
}