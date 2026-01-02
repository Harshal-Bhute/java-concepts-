package day18.abstraction;

public class AbstractionRule6 {
	public static void main(String[] args) {

		duty(new VegSparrow());
		duty(new NonVegSparrow());
	}

	static void duty(Bird b) {
		b.eat();
		b.fly();
	}
}



abstract class Bird {
                          // 
	abstract void eat(); //  IMPURE ABSTRACT CLASS bcz it has both abstract as well as concrete method
     void fly();         //
}


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
