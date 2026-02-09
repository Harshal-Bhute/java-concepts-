package DsaQuestions.Interview25;

public class ReverseString {

	//2nd apporach using char arr
	static String reverseArr(String s1) {
		char[] arr = s1.toCharArray();
		int i = 0,j=arr.length-1;
		while(i<j) {
			char a = arr[i];
			arr[i]=arr[j];
			arr[j]=a;
			i++;
			j--;
		}
		return new String(arr);
	}
	
	//2nd apporach using two pointer 
	
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
		String s1 = "javac";
		System.out.println(reverse(s1));
		System.out.println(reverseArr(s1));
		
	}
}

