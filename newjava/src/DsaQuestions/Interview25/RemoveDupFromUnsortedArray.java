package DsaQuestions.Interview25;

import java.util.Arrays;

public class RemoveDupFromUnsortedArray {

	public static void main(String[] args) {
		int arr[]= {1,9,3,4,1,3,9};
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		int u = 0;
		for(int i =1 ;i<arr.length-1;i++) {
			if(arr[i]!=arr[u]) {
				u++;
				arr[u]=arr[i];
			}
		}
		for(int i =0;i<=u;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println("\nunique elements : "+(u+1));

	}

}
