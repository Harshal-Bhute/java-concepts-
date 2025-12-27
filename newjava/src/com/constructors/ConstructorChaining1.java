package com.constructors;

//LOCAL CHAINNIG (within same class)------------------
public class ConstructorChaining1 {

	public static void main(String[] args) {
		
		Employee1 e = new Employee1();
		

	}

}

class Employee1 {

    int emp_id;
    String name;
    int salary;

    public Employee1() {
        this(101);
        System.out.println("0 parameterized constructor called");
    }

    public Employee1(int emp_id) {
        this(emp_id, "Arsh");
        System.out.println("1 parameterized constructor called");
    }

    public Employee1(int emp_id, String name) {
        this(emp_id, name, 20000);
        System.out.println("2 parameterized constructor called");
    }

    public Employee1(int emp_id, String name, int salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.salary = salary;
        System.out.println("3 parameterized constructor called");
    }
}

