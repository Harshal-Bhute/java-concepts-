package com.day19.InterfacesRules;

/*An interface reference can refer to an object of any implementing class.
Using this reference, only the methods declared in the interface can be accessed,
and the overridden version in the implementing class is executed at runtime.*/

public class Rule5 {

    // Step 1: Interface (Parent type)
    interface Calculator {
        void add();
        void sub();
    }

    // Step 2: Implementing class (Child)
    static class SimpleCalc implements Calculator {

        public void add() {
            System.out.println("Addition from SimpleCalc");
        }

        public void sub() {
            System.out.println("Subtraction from SimpleCalc");
        }

        // Child-specific method (NOT in interface)
        void mul() {
            System.out.println("Multiplication from SimpleCalc");
        }
    }

    // Step 3: Main method
    public static void main(String[] args) {

        // Interface reference pointing to implementing class object
        Calculator c = new SimpleCalc();

        // Allowed: methods declared in interface
        c.add();
        c.sub();

        // Not allowed: method only present in child class
        // c.mul();   // ❌ Compile-time error
    }
}
