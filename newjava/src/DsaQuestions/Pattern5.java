package DsaQuestions;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		int input = sc.nextInt();
		int space = input / 2;
		int star = 1;
		for(int i=1; i <= input ; i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			
			if(i <= input/2) {
				space--;
				star+=2;
			}
			else {
				star-=2;
				space++;
			}
			System.out.println();
			sc.close();
		}

	}

}
/*
 * 5
		*	
	*	*	*	
*	*	*	*	*	
	*	*	*	
		*
*/
