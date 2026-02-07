package DsaQuestions.Interview25;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[]= {1,3,4,5,5,6};
		if(arr.length==0) {
			return ;
		}
		int u = 0;
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]!=arr[u]) {
				u++;           //index++
				arr[u]=arr[i]; // swapping
			}
		}
		for(int i = 0;i<=u;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nUnique elements "+(u+1));
	}

}
