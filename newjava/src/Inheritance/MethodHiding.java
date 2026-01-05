package Inheritance;

public class MethodHiding {

    /*
     * Instance methods are polymorphic:
     * Method execution depends on the object, not the reference.
     */

    /*
     * Static methods are NOT polymorphic.
     * If a child class declares a static method with same signature,
     * it hides the parent class method.
     * This concept is called METHOD HIDING.
     */

    public static void main(String[] args) {

        Parentt1 p = new Parentt1();
        p.disp();   // Parent method

        Childd1 c = new Childd1();
        c.disp();   // Child method

        Parentt1 p1 = new Childd1();
        p1.disp();  // Parent method (method hiding)
    }
}

class Parentt1 {
    static void disp() {
        System.out.println("this is parent method");
    }
}

class Childd1 extends Parentt1 {
    static void disp() {
        System.out.println("this is child method");
    }
}
