package DsaQuestions.Interview25;

import java.util.Arrays;

public class PrintDistinctEleUsing2Pointer {

	public static void main(String[] args) {
		int arr[]= {1,2,1,2};
		Arrays.sort(arr);
		int index=0;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[index]) {
				index++;
				arr[index]=arr[i];
			}
		}
		
		for(int i=0;i<=index;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println("\nUnique elements "+(index+1));

	}

}
