package DsaQuestions.recursion;

import java.util.Scanner;

public class SummationUsingRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter :");
		int n = sc.nextInt();
		int sum=0;
		print(n,sum);

	}

	 static void print(int n, int sum) {
		if(n<1) {
			System.out.println(sum);
			return;
		}
		print(n-1,sum+n);
		
	}

}
