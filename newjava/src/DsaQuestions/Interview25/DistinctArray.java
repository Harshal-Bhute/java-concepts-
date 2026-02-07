package DsaQuestions.Interview25;

import java.util.HashSet;
import java.util.Set;

public class DistinctArray {

	public static void main(String[] args) {
	
		int arr[]= {1,2,3,4,6,7,7,1,2};
		
		Set s = new HashSet();
		for(int a : arr) {
			System.out.print(a+" ");
			s.add(a);
		}
		System.out.println("\nDistinct array ->"+s);

	}

}
