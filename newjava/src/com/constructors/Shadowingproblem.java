package com.constructors;

// Shadowing Problem

public class Shadowingproblem {

    public static void main(String[] args) {

        Employeee e = new Employeee("Yash", 1000, 21);

        System.out.println("name : " + e.getName());
        System.out.println("salary : " + e.getSalary());
        System.out.println("id : " + e.getId());
    }
}

class Employeee {
    private String name;
    private int salary;
    private int id;

    // SHADOWING PROBLEM HERE
    public Employeee(String name, int salary, int id) {
        name = name;       // ❌ local → local
        salary = salary;   // ❌ local → local
        id = id;           // ❌ local → local
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
