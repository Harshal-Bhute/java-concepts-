package com.constructors;


//Shadowing Problem using this method

public class EmployeeApp {

public static void main(String[] args) {

     Employee e = new Employee("RAj", 121,042);

     System.out.println("name : " + e.getName());
     System.out.println("salary : " + e.getSalary());
     System.out.println("id : " + e.getId());
 }
}

class Employee extends Object{
  private String name;
  private int salary;
  private int id;
 
 // SHADOWING PROBLEM  Solved
 
public Employee(String name, int salary, int id) {
	// super method();  call to the parent class default constructor which have default value
     this.name = name;       
     this.salary = salary;   
     this.id = id;           
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

