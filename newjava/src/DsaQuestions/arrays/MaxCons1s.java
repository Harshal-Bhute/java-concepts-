package DsaQuestions.arrays;

public class MaxCons1s {

	public static void main(String[] args) {
		int arr[]= {1,1,2,3,1,1,1,2,1,};
		System.out.println(MaxCon(arr));

	}
	
	static int MaxCon(int arr[]) {
		int count=0;
		int max= 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
				max=Math.max(max,count);
			}else {
				count=0;
			}
		}
		return max;
	}

}
