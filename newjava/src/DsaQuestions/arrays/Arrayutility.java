package DsaQuestions.arrays;
// LINEAR SEARCH
public final class Arrayutility {
	static int maxValue(int arr[]) {
		int max=arr[0];
		for(int i = 0 ; i<arr.length ;i++) {
			if(arr[i]>arr[0]) {
				max=arr[i];
			}
		}
		return max ;
	}
	
	static int minValue(int arr[]) {
		int min=arr[0];
		for(int i = 0 ; i<arr.length ;i++) {
			if(arr[i]>arr[0]) {
				min=arr[i];
			}
		}
		return min ;
	}

}
