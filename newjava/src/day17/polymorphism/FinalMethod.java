package day17.polymorphism;

/*
 * Main class
 */
public class FinalMethod {

    public static void main(String[] args) {

        Child1 c = new Child1();
        c.show();      // Child's own method
        c.display();   // Parent's final method
    }
}

/*
 * Parent class
 */
class Parent1 {

    // final method
    final void display() {
        System.out.println("This is final method of Parent class");
    }
}

/*
 * Child class extends Parent
 */
class Child1 extends Parent1 {

    // ✅ Allowed: child can have its own methods
    void show() {
        System.out.println("This is child class method");
    }

    /*
     * ❌ NOT ALLOWED
     * A final method cannot be overridden
     *
     * void display() {
     *     System.out.println("Trying to override final method");
     * }
     */
}
