package DsaQuestions.Interview25;

import java.util.Scanner;

public class KitePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input :");
		int n = sc.nextInt();
		int spaces=n/2;
		int star= 1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=spaces;j++) {
				System.out.print("\t");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*\t");
			}
			if(i<=n/2) {
			star+=2;
			spaces--;
			}else {
				star-=2;
				spaces++;
			}
			System.out.println();
			
		}
	}

}
