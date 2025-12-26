package newjava;
import java.util.StringTokenizer;

public class CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " hi hello hey";
		StringTokenizer st = new StringTokenizer(s," ");
		 while (st.hasMoreTokens()) {
	            st.nextToken();   
	        }

	}

}
