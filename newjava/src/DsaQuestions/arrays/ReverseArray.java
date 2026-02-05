package DsaQuestions.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int i = 0,j=arr.length-1,temp=0;
		while(i<j) {
			arr[i]=temp;
			arr[i]=arr[j];
			arr[j]=arr[i];
			i++;
			j--;
		}
		
		System.out.println();
	
		for(int k = 0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		

	}

}
