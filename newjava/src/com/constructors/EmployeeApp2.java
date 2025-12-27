package com.constructors;




public class EmployeeApp2 {

public static void main(String[] args) {

     Employee2 e = new Employee2();

     System.out.println("name : " + e.getName());
     System.out.println("salary : " + e.getSalary());
     System.out.println("id : " + e.getId());
 }
}

class Employee2 {
  private String name;   // 
  private int salary;
  private int id;
 
 
 
public Employee2(String name, int salary, int id) {
	
     this.name = name;       
     this.salary = salary;   
     this.id = id;           
 }

public Employee2() {
	           
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



/*in the above program for a constructor which does not accept any argument but their is no such constructor  present in our class and hence we are going to get a complile time error.
only and only if the programmer has not defined a constructor in the class  the compiler will add the zeo parameterized constructor.
Such a constructor which is provided by the compiler when no constructor was provide by the programmer is known as default constructor.
*/
// Java provides a default constructor ONLY IF the programmer provides NO constructors at all
