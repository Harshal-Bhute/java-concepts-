package DsaQuestions.Interview25;

import java.util.Scanner;

public class PrintPrimeNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  : ");
		int a = sc.nextInt();
		if(a<=1) {
			System.out.println(a+" Not a prime number");
		}
		
		for(int i = 2 ; i*i <= a ; i++) {
			if(a%i==0) {
				System.out.println(a+" Not a prime");
				return;
			}
		}
		System.out.println(a+" Is a prime number");

	}

}
