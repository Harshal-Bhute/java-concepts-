package DsaQuestions.arrays;

public class MinMaxWithoutInt {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		if(arr.length<2) {
			throw new IllegalArgumentException("Array must have at least 2 elements");
		}
		
		int max,secondMax;
		int min,secondMin;
	
		//to initialize with first two idx of array
		if(arr[0]<arr[1]){
			secondMax=arr[0];
			max=arr[1];
			min=arr[0];
			secondMin=arr[1];
		}else {
			secondMax=arr[1];
			max=arr[0];
			min=arr[1];
			secondMin=arr[0];
		}
		boolean FoundSecondMax=(arr[0]!=arr[1]);
		boolean FoundSecondMin=(arr[0]!=arr[1]);
		
		
		for(int i =2;i<arr.length;i++) {
			int x = arr[i];
			//for second largest
			if(x>max) {
				secondMax=max;
				max=x;
				//FoundSecondMax=true;
			}else if(x<max && x>secondMax){
				secondMax=x;
				//FoundSecondMax=true;
			}
			
			//for Second Smallest
			if(x<min) {
				secondMin=min;
				min=x;
				//	FoundSecondMin=true;
			}else if(x>min && x<secondMin){
				secondMin=x;
				//FoundSecondMin=true;
			}
	}
		if(!FoundSecondMax || !FoundSecondMin) {
			throw new IllegalArgumentException("secondMax or secondMin does not exist");
		}
		System.out.print("\nSecond max : "+secondMax);
		System.out.print("\nSecond min : "+secondMin);
	}
}



