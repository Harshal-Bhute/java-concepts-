package DsaQuestions.arrays;

public class EvenAndOdd1 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,0,140,11};
		int even=0;
		int odd=0;
		int evenSum=0;
		int oddSum=0;
		for(int a : arr) {
			if(a%2==0) {
				even++;
				evenSum += a;
			}else
			{
				odd++;
				oddSum += a;
			}
		}
		System.out.println("Number of even nums :"+even+" AND Sum is "+ evenSum);
		System.out.println("Number of odd nums :"+odd+" AND Sum is "+ oddSum);

	}

}
