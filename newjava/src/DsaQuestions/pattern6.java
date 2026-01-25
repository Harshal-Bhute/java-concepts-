package DsaQuestions;

import java.util.Scanner;

public class pattern6 {
 public static void main(String[]args)
 {
	 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		int n = sc.nextInt();
		int star1=n/2;
		int space=1;
		int star2=n/2;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<star1;j++)
			{
			System.out.print("*");
		    }
			for(int k=0;k<space;k++)
			{
				System.out.print(" "); 
			}
			for(int l=0;l<star2;l++)
			{
				System.out.print("*");
			}
			if(i<n/2)
			{
			star1--;
			space+=2;
			star2--;
			}
			else
			{
				star1++;
				space-=2;
				star2++;
			}
			System.out.println();
			
		}
 }
}
