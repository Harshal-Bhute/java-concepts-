package DsaQuestions.Interview25;

public class PalindromeInString {
	static String reverse(String s1) {
		StringBuilder s2 = new StringBuilder(s1);
		int start = 0;
		int end = s2.length()-1;
		
			while(start<end) {
		    char temp = s2.charAt(start);
			s2.setCharAt(start,s2.charAt(end));
			s2.setCharAt(end,temp);
			start++;
			end--;
			
		}
			return s2.toString();
	}

	public static void main(String[] args) {
		String s1 = "aabaa";
		String s2=reverse(s1);
		if(s2.equals(1)) {
			System.out.println("Is palindrome");
		}else {
			System.out.println("Is not a palindrome");
		}

	}

}
