package DsaQuestions;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the no of rows :");
		int inp=sc.nextInt();
		int sp=inp-1;
		int st=1;
		for(int i = 1; i<=inp ; i++) {
			for(int j=1;j<=sp ; j++) {
				System.out.print("  ");
			}
			for(int j =1;j<=st;j++){
				System.out.print("* ");
			}
			sp--;
			st+=2;
			System.out.println();
		}

	}

}
