package DsaQuestions.Interview25;

import java.util.Scanner;

public class PrintPrimeUpToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start : ");
		int a = sc.nextInt();
		System.out.print("Enter end : ");
		int b = sc.nextInt();
		
		for(int i = a ; i<= b ;i++) {
			if(IsPrime(i)) {
				System.out.println(i+" ");
			}
		}

	}
	
	static boolean IsPrime(int a) {
		if(a<=1) return false;
		
		for(int i = 2 ; i * i <= a;i++) {
			if(a%i==0) {
				return false;	
			}
			
		}
		return true;
		
	}

}
