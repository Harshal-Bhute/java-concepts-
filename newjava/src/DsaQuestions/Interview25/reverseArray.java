package DsaQuestions.Interview25;

public class reverseArray {

	public static void main(String[] args) {
		int arr[]= {1,3,5,7,9,11,0};
		int i=0,j=arr.length-1;
		 while(i<arr.length/2) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		
		for (int k : arr) {
			System.out.print(k+ " ");
		}

	}

}
