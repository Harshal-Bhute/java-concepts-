package DsaQuestions.arrays;

public class Array1 {
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5}; // declaration 1
		int arr1[]=new int[5] ; //declaration 2
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=40;
		arr1[4]=50;
		
		System.out.println("With for loop");
		for(int i = 0 ; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nWith for each loop");
		for (int i : arr1) {
			System.out.print(i+" ");
		}
		
		 
	}

}
