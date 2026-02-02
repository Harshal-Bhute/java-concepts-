package day28sortingComplexObject;

import java.util.ArrayList;
import java.util.Collections;

//Problem statement still give class cast exception
public class EmployeApp1 {

	public static void main(String[] args) {
		Employee e = new Employee(1,"Harshal",50000);
		Employee e1 = new Employee(0,"Harsh",48000);
		Employee e2 = new Employee(2,"Arsh",35000);
		ArrayList al = new ArrayList();
		al.add(e2);
		al.add(e1);
		al.add(e);
		System.out.println(al);
		Collections.sort(al);  //  java.lang.ClassCastException
		System.out.println(al);
		
		

	}

}

class Employee{
	int empId;
	String name;
	double salary;
	public Employee(int i, String name, double salary) {
		super();
		this.empId = i;
		this.name = name;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	
	public String toString() {
		return empId+" "+name+" "+salary;
		
	}
	
	
}