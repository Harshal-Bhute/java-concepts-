package day18.abstraction;

public class AbstractionRule1and2 {
	public static void main(String[] args) {

		// Rule 1: Cannot create object of abstract class
		// Bird b = new Bird();  // ❌ error

		Bird b = new Sparrow(); // ✔ allowed
		b.eat();
		b.fly();
		b.jump();
	}
}

// Abstract class
abstract class Bird {

	// abstract methods
	abstract void eat();
	abstract void jump();

	// non-abstract method
	void fly() {
		System.out.println("Bird is flying");
	}
}

// Concrete child class
class Sparrow extends Bird {

	void eat() {
		System.out.println("Bird is eating");
	}

	void jump() {
		System.out.println("Bird is jumping");
	}
}
