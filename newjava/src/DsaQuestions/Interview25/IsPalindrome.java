package DsaQuestions.Interview25;

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Input-> ");
		 int num= sc.nextInt();
		 int temp = num;
		 int result=0;
		 while(temp>0) {
			 int digit = temp%10;
			 result=result*10+digit;
			 temp/=10;
		 }
		 if(result==num) {
			 System.out.println(num+" Is palindrome number");
		 }else {
			 System.out.println(num+" Is not a palindrome number");
		 }

	}

}
