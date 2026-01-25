package DsaQuestions;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the no of rows :");
		int inp=sc.nextInt();
		int sp=0;
		int st=inp+(inp-1);
		for(int i = 1; i<=inp ; i++) {
			for(int j=1;j<=sp ; j++) {
				System.out.print("  ");
			}
			for(int j =1;j<=st;j++){
				System.out.print("* ");
			}
			st-=2;
			sp++;
			System.out.println();
		}

	}

}
