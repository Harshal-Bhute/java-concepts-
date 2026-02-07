package DsaQuestions.Interview25;

import java.util.HashSet;
import java.util.Set;

//When to use the Hash set  approach .
//when order of elements matters and extra space is allowed
public class PrintDistinctEleUsingHashSet {

	public static void main(String[] args) {
	 int arr[] = {1,4,4,7};
	 Set set = new HashSet();
	 
	 int index = 0 ;//points to the index of set also keeps track of unique elements
	 
	 for(int i = 0;i<arr.length;i++) {
		 if(!set.contains(arr[i])) {
			 set.add(arr[i]);
			 arr[index]=arr[i];  // will place the unique elements at first
			 index++;
		 }
	 }
	 
	 for(int j = 0 ;j<index;j++) {
		 System.out.print(arr[j]+" ");
	 }
	
	 System.out.println("\nNo of unique elements "+index);

	}

}
