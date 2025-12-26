package newjava;
import java.util.StringTokenizer;

public class ReversString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am Iron Man";
		char[] a = s.toCharArray();
		int first=0;
		int last = a.length-1;
		while(first<last) {
			char temp = a[first];
			a[first]=a[last];
			a[last]=temp;
			
			first++;
			last--;
			
		}
		String reversed = new String(a);
		System.out.println(reversed);
		
	}

}
