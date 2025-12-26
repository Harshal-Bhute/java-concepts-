package newjava;

public class StringBasics3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("arsh");
		String s2 = new String("arsh");
		
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