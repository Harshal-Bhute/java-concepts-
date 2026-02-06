package DsaQuestions.Interview25;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  : ");
		int a = sc.nextInt();
		int result=0;
		while(a>0) {
			int digit = a%10;
			result=result * 10 + digit;
			a/=10;
		}
		System.out.println("Reversed num : "+result);

	}

}
