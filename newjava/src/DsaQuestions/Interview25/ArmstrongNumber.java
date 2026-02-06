package DsaQuestions.Interview25;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Number : ");
		int num= sc.nextInt();
		int temp = num;
		int sum = 0;
		int pow=0;
		
				while(temp>0) {
					temp/=10;
					pow++;
				}
				temp=num;
				
				while(temp>0) {
					int digit=temp%10;
					sum+=Math.pow(digit,pow);
					temp/=10;
				}
				if(sum==num) {
					System.out.println(num+" Is a armstrong number");
				}else {
					System.out.println("Not a palindrome number");
				}

	}

}
