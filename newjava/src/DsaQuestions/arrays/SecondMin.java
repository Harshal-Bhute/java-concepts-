package DsaQuestions.arrays;

public class SecondMin {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,19};
		if(arr.length<2) {
			throw new IllegalArgumentException("Array has less than two elements");
		}
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for (int i : arr) {
			System.out.print(i+" ");
			if(i < smallest) {
				secondSmallest = smallest;
				smallest = i;
			}else if(i > smallest && i < secondSmallest){
				secondSmallest=i;
				
			}
		}
		if(secondSmallest==Integer.MAX_VALUE) {
			throw new IllegalArgumentException("No second smallest in array");
		}
		
		System.out.println("\nSecond smallest element : "+secondSmallest);

	}

}

