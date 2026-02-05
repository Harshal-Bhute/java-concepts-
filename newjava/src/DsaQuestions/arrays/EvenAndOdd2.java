package DsaQuestions.arrays;

public class EvenAndOdd2 {

	public static void main(String[] args) {
		
			int arr[]= {1,2,3,4,5,6,7,8,9};
			int evenNums = 0;
			int oddNums  = 0;
			int evenSum=0;
			int oddSum=0;
			int maxEven = Integer.MIN_VALUE;
			int minOdd=Integer.MAX_VALUE;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]%2==0) {
					evenNums++;
					evenSum+=arr[i];
						
					if(arr[i]>maxEven) {
						maxEven=arr[i];
					}
					System.out.print("\nFound even at index :"+i+" having value :"+arr[i]);	
				}
				
				else {
					oddNums++;
					oddSum+=arr[i];
					
					if(arr[i]<minOdd) {
						minOdd=arr[i];
					}
					System.out.print("\nFound odd at index :"+i+" having value :"+arr[i]);	
				}
			}
				System.out.println("\nTotal even sum is :"+evenSum);
				System.out.println("Total odd sum is :"+oddSum);
				System.out.println("Total even values :"+evenNums);
				System.out.println("Total odd values :"+oddNums);

		}

	}


