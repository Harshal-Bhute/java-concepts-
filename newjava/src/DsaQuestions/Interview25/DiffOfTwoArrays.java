package DsaQuestions.Interview25;

import java.util.Scanner;

public class DiffOfTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter size");
		int a = sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter size a1");
		int a1 = sc.nextInt();
		int arr1[]=new int[a1];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		int diff[]=new int[a1];
		int i = arr.length-1;
		int j = arr1.length-1;
		int k = diff.length-1;
		int c =0;
		int arrVal = i >=0 ? arr[i]:0;
		
		int d=0;
		while(k>=0) {
			if(arr1[j]>=arrVal) {
				d=arr1[j]+c - arrVal;
			}else {
				d=arr1[j]+c+10-arrVal;
				c=-1;
			}
			
			diff[k]=d;
			j--;
			i--;
			k--;
		}
		
		 int idx = 0;
		 while(idx < diff.length) {
			 if(diff[idx]==0) {
				 idx++;
			 }else {
				 break;
			 }
		 }
		 while(idx<diff.length) {
			 System.out.print(diff[idx]+ " ");
			 idx++;
		 }
	

	}

}
