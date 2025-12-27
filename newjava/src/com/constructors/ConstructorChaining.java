package com.constructors;


//Constructor chaining

public class ConstructorChaining {

public static void main(String[] args) {

     Employee e = new Employee();

     System.out.println("name : " + e.getName());
     System.out.println("salary : " + e.getSalary());
     System.out.println("id : " + e.getId());
     
 }
}

class Employee {
  private String name;   
  private int salary;
  private int id;
 
 
 
public Employee(String name, int salary, int id) {
	// super();java automatically inserts at first line if missing in every constructor call to the parent class default constructor which have default values 
     this.name = name;       
     this.salary = salary;   
     this.id = id;           
 }
	


public Employee() {
	this("arsh", 101, 21); /* delegate to same class constructor */
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