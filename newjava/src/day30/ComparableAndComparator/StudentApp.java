package day30.ComparableAndComparator;

import java.util.HashMap;

public class StudentApp {

	public static void main(String[] args) {
		Student s = new Student("Harshal", 22, "Male", 7, "harshal@gmail.com", 123456789, "Nagpur");
		Student s1 =new Student("Harsh", 21, "Male", 8, "harsh@gmail.com", 12345, "Bhandara");
		Student s2 =new Student("arsh", 23, "Male", 6, "arsh@gmail.com", 123, "Lakhani");
		HashMap hm = new HashMap();
		hm.put(1,s);
		hm.put(3, s1);
		hm.put(2, s2);
		System.out.println(hm);
		
		
		
	}

}

class Student{
	
	String name;
	int age;
	String gender;
	int sem;
	String email;
	int no;
	String city;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getSem() {
		return sem;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getNo() {
		return no;
	}
	
	public String getCity() {
		return city;
	}

	public Student(String name, int age, String gender, int sem, String email, int no, String city) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.sem = sem;
		this.email = email;
		this.no = no;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", sem=" + sem + ", email=" + email
				+ ", no=" + no + ", city=" + city + "]";
	}
	
	
}