package day18.abstraction;

public class AbstractionRule4 {
	public static void main(String[] args) {

		duty(new VegSparrow());
		duty(new NonVegSparrow());
	}

	static void duty(Bird b) {
		b.eat();
		b.fly();
	}
}

// Rule 4: If a child class partially implements an abstract class,
// then the child class must also be declared abstract.

abstract class Bird {

	abstract void eat();
	abstract void fly();
}

// Sparrow does NOT implement fly(), so it must be abstract
abstract class Sparrow extends Bird {

	void fly() {
		System.out.println("Sparrow is flying");
	}
}

class VegSparrow extends Sparrow {

	void eat() {
		System.out.println("VegSparrow eats grains");
	}
}

class NonVegSparrow extends Sparrow {

	void eat() {
		System.out.println("NonVegSparrow eats worms");
	}
}
