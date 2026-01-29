package day26.ImplOfColl_Frame;

import java.util.ArrayList;

public class ArrayListImpl {

	public static void main(String[] args) {
		Student s1 = new Student("harshal",20,"male");
		Student s2 = new Student("hars",21,"male");
		Student s3 = new Student("sham",22,"male");
		Student[] arr = {s1,s2,s3};
		for (Student s : arr) {
			System.out.println(s.getName()+" ");
			System.out.println(s.getAge()+" ");
			System.out.println(s.getGender()+" ");
			
		}
		
//		ArrayList a = new ArrayList();
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(40);
//		a.add("Hello");
//		a.add("hey");
//		a.add("hi");
//		for(Integer al : a ) {
//			System.out.println(al);	
//		}
//		for(String al : a ) {
//			System.out.println(al);	
//		}
		
//	 String[] arr = {"harshal","aish","sujal","Sonit"};
//	 for (String s : arr) {
//		System.out.println(s);
//	}
	 
		 
		 
	 }
		

	}

class Student {
	 String name;
	 int age;
	 public Student(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	 String gender;

	 public String getName() {
		 return name;
	 }

	

	 public int getAge() {
		 return age;
	 }


	 public String getGender() {
		 return gender;
	 }
}

	 
