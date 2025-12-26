package DsaQuestions;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String args[]) {
		System.out.println("Enter the integer number");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		int n = 0;
		int temp = num;
		int sum =0;
		
		while(temp > 0) {
			n++;
			temp /= 10;	
		}
		
		temp = num;
		while(temp>0) {
			int digit = temp % 10;
			sum += Math.pow(digit, n);
			temp/=10;
		}
		if(sum == num) {
			System.out.println("Is a armstrong number");
	}else {
		System.out.println( num+" Is not an armstrong number");
	}

}
}
