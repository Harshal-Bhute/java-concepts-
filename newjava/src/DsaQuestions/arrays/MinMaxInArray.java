package DsaQuestions.arrays;

import java.util.Iterator;
import java.util.Scanner;

public class MinMaxInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Pls,enter size of array : ");
		
		int size = sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter value of "+i +" ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Array ->");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		System.out.println("Max-"+Arrayutility.maxValue(arr));
		System.out.println("Min-"+Arrayutility.minValue(arr));

	}

}
