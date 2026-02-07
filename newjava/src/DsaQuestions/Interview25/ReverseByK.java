package DsaQuestions.Interview25;

import java.util.Scanner;

public class ReverseByK {
	
	 static void reverse(int arr[],int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter k :");
		int k=sc.nextInt();
		
		k=k%arr.length;
		if(k<0) {
			k=k+arr.length;
		}
		//reverse 1st half 
		reverse(arr,0,arr.length-k-1);
		//reverse 2nd Half
		reverse(arr,arr.length-k,arr.length-1);
		//reverse whole
		reverse(arr,0,arr.length-1);
		
		for(int i : arr) {
			System.out.print(i +" " );
		}

	}

}
