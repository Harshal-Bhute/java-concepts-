package newjava;

public class StringConcat {
	public static void main(String[] args) {
		String s1="arsh";
		String s2 = "Arsh";
		
		if(s1==s2)
		{
			System.out.println("reference are equal");
			
		}
		else
		{
			System.out.println("reference are not equl");
		}
		if(s1.equals(s2))
		{
			System.out.println("values are equal");
			
		}
		else
		{
			System.out.println("values are equal");

		}

	}
}