package DsaQuestions.recursion;

import java.util.Scanner;
//Q.print nums from 1 to n
public class OneToN {
	
	static void print(int i,int n) {
		if(i>n) return;  // Base case
		System.out.println(i);
		print(i+1,n);     //function call
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter limit :");
		int n = sc.nextInt();
		
		print(1,n);
		

	}

}
