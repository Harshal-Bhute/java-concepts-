package com.constructors;

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Yash",1000,21);
		System.out.println("name :"+e.getName());
		System.out.println("salary :"+e.getSalary());
		System.out.println("id :"+e.getAge());
		
		

	}

}

class Employee{
	private String name;
	private int salary;
	private int id ;
	
	public Employee(String n ,int s,int a) {
		name=n;
		salary=s;
		id=a;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public int getAge() {
		return id;
	}
}
