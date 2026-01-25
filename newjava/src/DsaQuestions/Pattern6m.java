package DsaQuestions;


import java.util.Scanner;

public class Pattern6m {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		int input=sc.nextInt();
		int space=1;
		int star1= input-1;
		int star2 = input-1;
		for(int i = 1;i<=input;i++) {
			for(int j = 1; j<= star1;j++) {
				System.out.print("* ");
				
			}
			for(int k = 1; k<= space;k++) {
				System.out.print("  ");
			}
			for(int l = 1; l<= star2;l++) {
				System.out.print("* ");
			}
			System.out.println();
			
			if(i<= input/2) {
				star1--;
				space+=2;
				star2--;
			}else {
				star1++;
				space-=2;
				star2++;
			}
			
			
		}
		sc.close();

	}

}
