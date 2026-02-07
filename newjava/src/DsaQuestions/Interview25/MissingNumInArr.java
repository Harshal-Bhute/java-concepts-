package DsaQuestions.Interview25;

public class MissingNumInArr {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,7,8,9,};
		int n = arr.length + 1;
		int expSum= n * (n + 1)/2;
		int realSum=0;
		for(int i : arr) {
			realSum+=i;
		}
		int missingNum=expSum-realSum;
		System.out.println("Missing num is : "+missingNum);

	}

}
