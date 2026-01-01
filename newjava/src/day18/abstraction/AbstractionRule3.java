
package day18.abstraction;

public class AbstractionRule3 {
	public static void main(String[] args) {

		Bird b = new Sparrow();
		b.eat11();
		b.fly();
	}
}

// Abstract parent class
abstract class Bird {

	abstract void eat11();
	abstract void fly();
}

// Rule 3 applied:
// Child class must implement ALL abstract methods
class Sparrow extends Bird {

	void eat11() {
		System.out.println("Bird is eating");
	}

	void fly() {
		System.out.println("Bird is flying");
	}
}
