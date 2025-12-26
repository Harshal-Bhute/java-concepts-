package com.encapsulation;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		studentS1 s = new studentS1();
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		s.setAge(age);
		
		System.out.println("Enter your gender");
		String gender =sc.next();
		s.setGender(gender);
		
		
		System.out.println("Enter your name");
		String name =sc.next();
		s.setName(name);
		
		
		System.out.println("Your age is :"+s.getAge());
		System.out.println("Your name is :"+s.getName());
		System.out.println("Your gender is :"+s.getGender());
		
		
		

	}

}
class studentS1{
	private int age;
	private String name;
	private String gender;
	
	/*public void setData(int newAge,String newGender,String newName) {
		age=newAge;
		name=newName;
		gender=newGender;
	}*/
	
	public void setAge(int newAge) {
		age=newAge;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String newName) {
		name=newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setGender(String newGender) {
		gender=newGender;
	}
	public String getGender() {
		return gender;
	}
	
	
}
