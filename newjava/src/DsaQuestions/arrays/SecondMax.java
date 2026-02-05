package DsaQuestions.arrays;

public class SecondMax {

	public static void main(String[] args) {
		//second largest 
		int arr[]= {1,2,3,4,5,6,7,8,9,19};
		if(arr.length<2) {
			throw new IllegalArgumentException("Array has less than two elements");
		}
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i : arr) {
			System.out.print(i+" ");
			if(i>largest) {
				secondLargest=largest;
				largest=i;
			}else if(i < largest && i > secondLargest){
				secondLargest=i;
				
			}
		}
		if(secondLargest==Integer.MIN_VALUE) {
			throw new IllegalArgumentException("No second largest in array");
		}
		
		System.out.println("\nSecond largest element : "+secondLargest);

	}

}
