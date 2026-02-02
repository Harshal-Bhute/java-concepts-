package toStringMethod;

public class Student {
	public static void main(String[] args) {
		StudentApp s = new StudentApp("h",12,"Male",123456778);
		System.out.println(s.getAge()); 
		System.out.println(s); 
	}
	
}

	class StudentApp{
		String name;
		int age ;
		String gender;
		int no;
		
		public StudentApp(String name, int age, String gender,int no) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.no = no;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public String getGender() {
			return gender;
		}

		public int getNo() {
			return no;
		}
		
		public String toString() {
			return name;
			
		}
	

		

		
		
	}
		
		

	


