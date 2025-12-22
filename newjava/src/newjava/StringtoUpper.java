package newjava;

public class StringtoUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Arsh";
		String s2 ="Md Arsh";
		System.out.println(s1.toUpperCase()); // immutable string can't be changed
		System.out.println(s1.toLowerCase());
		System.out.println(s1.contains("Ar"));
		System.out.println(s1.indexOf("r"));
		System.out.println(s2.substring(3));
		System.out.println(s2.substring(0,2));
		System.out.println(s2.charAt(3));
		
	}

}

