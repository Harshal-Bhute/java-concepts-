package com.day19.InterfacesRules;

public class Rule6 {

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

        // Child-specific method (NOT in interface) is a specialized method
        void mul() {
            System.out.println("Multiplication from SimpleCalc");
        }
    }

    // Step 3: Main method
    public static void main(String[] args) {

        // Interface reference pointing to implementing class object
        Calculator c = new SimpleCalc();

        //  methods declared in interface
        c.add();
        c.sub();

        
        // c.mul();   // ❌ Compile-time error if called via calculator reference
        
        /*Rule6 . As parent type reference can't refer the specialized method .To access the specialized method of implementing 
        class using parent interface reference type we must perform down casting */
        ((SimpleCalc)(c)).mul();
    }
}
