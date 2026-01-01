package day17.polymorphism;

/*
 * This class contains the main method.
 * Execution of the program starts from main().
 */
public class ParentApp {

    public static void main(String[] args) {

        // Creating object of Child class
        Child c = new Child();

        // Calling overridden method
        c.disp1();
    }
}

/*
 * Parent class
 */
class Parent {

    // Instance variable of Parent class
    int x = 10;

    // Parent class method
    void disp1() {
        System.out.println("This is parent class");
    }
}

/*
 * Child class extends Parent class
 * This represents IS-A relationship (Child IS-A Parent)
 */
class Child extends Parent {

    // Instance variable of Child class
    // This variable hides the Parent class variable x
    int x = 20;

    // Overriding Parent class method
    void disp1() {

        // Calling Parent class method using super keyword
        super.disp1();

        // Child class own statement
        System.out.println("This is child class");

        // Accessing variables
        System.out.println("Child x value : " + x);        // 20
        System.out.println("Child x using this : " + this.x); // 20
        System.out.println("Parent x using super : " + super.x); // 10
    }
}

/*
 * NOTES:
 *
 * super keyword:
 * - Refers to immediate parent class object
 * - Used to call parent class methods
 * - Used to access parent class variables
 *
 * this keyword:
 * - Refers to current class object
 *
 * If parent and child have same variable name:
 * - Child variable hides parent variable
 * - Use super.variableName to access parent variable
 *
 * super() method:
 * - Used to call parent class constructor
 * - Must be the first statement in constructor
 *
 * this() method:
 * - Used to call current class constructor
 * - Must be the first statement in constructor
 */
