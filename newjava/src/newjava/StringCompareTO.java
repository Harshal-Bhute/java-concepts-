package newjava;

public class StringCompareTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "SACHIN";
		String s2 = "SAURAV";
		int res =s1.compareTo(s2);
		System.out.println(res);
		if(res>0) {
			System.out.println("s1 is greater");
			
		}
		else if(res < 0) {
			System.out.println("s2 is greater");
		}else {
			System.out.println("Both are same");
		}

	}

}
