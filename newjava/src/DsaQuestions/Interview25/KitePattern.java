package DsaQuestions.Interview25;

import java.util.Scanner;

public class KitePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input :");
		int n = sc.nextInt();
		int newN=n+ (n/2)-1;
		int spaces=n/2;
		int star= 1;
		for(int i=1;i<=newN;i++) {
			
			for(int j=1;j<=spaces;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			if(i<=n/2) {
			    star+=2;
			    spaces--;
			}else if(i<n && i > n/2){
				star-=2;
				spaces++;
			}
			else {
				spaces--;
				star+=2;
			}
			System.out.println();
			
		}
	}

}
