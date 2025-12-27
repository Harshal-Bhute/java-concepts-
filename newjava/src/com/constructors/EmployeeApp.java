package com.constructors;


//Shadowing Problem using this method

public class EmployeeApp {

public static void main(String[] args) {

     Employee3 e = new Employee3("Rj", 121,042);

     System.out.println("name : " + e.getName());
     System.out.println("salary : " + e.getSalary());
     System.out.println("id : " + e.getId());
     
 }
}

class Employee3 {
  private String name;   // 
  private int salary;
  private int id;
 
 // SHADOWING PROBLEM  Solved
 
public Employee3(String name, int salary, int id) {
	// super method();  call to the parent class default constructor which have default
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


