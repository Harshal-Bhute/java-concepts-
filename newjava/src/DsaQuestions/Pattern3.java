package DsaQuestions;

import java.util.Iterator;
import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows =sc.nextInt();
		int space = rows-1;
		int stars = 1;
		
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= stars; j++) {
				System.out.print("*\t");
			}
			
			space--;
			stars++;
			System.out.println();
		}
	}

}
/*
 5
				*	
			*	*	
		*	*	*	
	*	*	*	*	
*	*	*	*	*		

*/
