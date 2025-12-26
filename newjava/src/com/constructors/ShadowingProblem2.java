package com.constructors;


//Shadowing Problem using this method

public class ShadowingProblem2 {

 public static void main(String[] args) {

     Employeeee e = new Employeeee("Yash", 1000, 21);

     System.out.println("name : " + e.getName());
     System.out.println("salary : " + e.getSalary());
     System.out.println("id : " + e.getId());
 }
}

class Employeeee {
 private String name;
 private int salary;
 private int id;

 // SHADOWING PROBLEM  Solved
 
 public Employeeee(String name, int salary, int id) {
     this.name = name;       // ❌ local → local
     this.salary = salary;   // ❌ local → local
     this.id = id;           // ❌ local → local
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
