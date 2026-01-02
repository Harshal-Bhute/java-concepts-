package Day19.Interface;
import java.util.Scanner;
public class NewCalc {

	public static void main(String[] args) {
		duty(new RajInfotech1());

	}
	
	static void duty(CodCalc c ) {             //static method to achieve polymorphism
		Scanner sc = new Scanner (System.in);
		System.out.println("+,-,*,/");
	
		char op= sc.next().charAt(0);
		switch (op) {
		case '+':
			c.add();
			break;
		case '-':
			c.sub();
			break;
		case '*':
			c.mul();
			break;
			
		case '/':
			c.div();
			break;
		
		 default:
             System.out.println("Invalid operator");
             return;
			
		}
			
	}

}

class RupeshInfotech1 implements CodCalc{
	
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

class RajInfotech1 implements CodCalc {

    Scanner sc = new Scanner(System.in);

    public void add() {
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Answer: " + (a + b));
    }

    public void sub() {
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Answer: " + (a - b));
    }

    public void mul() {
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Answer: " + (a * b));
    }

    public void div() {
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Answer: " + (a / b));
    }
}
