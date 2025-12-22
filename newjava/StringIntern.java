package newjava;

public class StringIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Deep");
		String s2= s1.intern();
		String s3= s1.intern();
		
		if (s2==s3) {
			System.out.println("references are equal")
		}else {
			System.out.println("references are not equal")
		}
		
		
	}

}