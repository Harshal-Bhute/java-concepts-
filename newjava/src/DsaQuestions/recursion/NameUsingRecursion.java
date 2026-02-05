package DsaQuestions.recursion;
// Q.print name n times 
public class NameUsingRecursion {
	
	static void print(int cn) {
		if(cn==0) return;
		System.out.println(cn+" heloo");
		
		print(cn-1);
		
	}

	public static void main(String[] args) {
		int cn = 5;
		print(cn);

	}

}
