package day24.CollectionFrameworks;

public class BoxingAndUnBoxing {

	public static void main(String[] args) {
		Integer a = new Integer(10); // not required it is done by compiler
		Integer a1 = a; // autoboxing
		int b1=a1.intValue();//unboxing
		int b = a1;//auto unboxing
		

	}

}
