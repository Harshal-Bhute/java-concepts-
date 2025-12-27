package newjava;

public class ReferenceVariable {
	public static void main(String[] args) {
		
		Usestudent as=new Usestudent();
		student res = as.dispStudent();
		System.out.print(res);
	}

}
class student
{
	String name;
	
}
class Usestudent
{
	student dispStudent()
	{
		student s=new student();
		return s ;
	}
}