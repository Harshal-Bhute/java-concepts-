package day18.abstraction;

abstract public class AbstractionRule5 {
	public static void main(String[] args) {
	 System.out.println(a);
	 disp();
	}
 public AbstractionRule5() {
	 
 }
 static int a ;
 
 static {
	 a=10;
 }
 static void disp() {
	 System.out.println(a);
 }
 
 int b;
 {
	b=20; 
 }
 void disp1() {
	 System.out.println(b);
 }
}
