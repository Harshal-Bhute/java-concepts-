package DsaQuestions.Interview25;

import java.util.Scanner;

public class FibonnaccieSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Input-> ");
		 int num= sc.nextInt();
		 if(num<=0)return;
		System.out.print("0 1 ");
		int first = 0;
		int second = 1;
		while(first + second < num) {
			int third = first + second ;
			System.out.print(third + " ");
			first=second;
			second=third;
		}
		
		 
		 

	}

}
