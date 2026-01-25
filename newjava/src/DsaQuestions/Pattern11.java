package DsaQuestions;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value");
		int input=sc.nextInt();
		int val=1;
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(val+" ");
				val++;
			}
			System.out.println();
		}
		
		sc.close();
		

	}

}
