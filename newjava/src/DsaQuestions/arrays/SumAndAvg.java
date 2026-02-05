package DsaQuestions.arrays;

public class SumAndAvg {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int sum =0;
		for (int i : arr) {
			System.out.print(i+" ");
			sum+=i;
		}
		int avg = sum / arr.length;
		System.out.println("\nSum "+sum);
		System.out.println("avg "+avg);
		
		

	}

}
