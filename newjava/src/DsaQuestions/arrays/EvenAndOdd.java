package DsaQuestions.arrays;

public class EvenAndOdd {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int even = 0;
		int odd  = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2 ==0) {
				even+=1;
			}else if(arr[i]%2 != 0) {
				odd+=1;
			}
		}
		System.out.println("Even num : "+even);
		System.out.println("Odd num : "+odd);

	}

}
