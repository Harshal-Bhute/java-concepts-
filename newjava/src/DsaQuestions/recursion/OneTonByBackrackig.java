package DsaQuestions.recursion;

import java.util.Scanner;
// from n to 1    ....i = n  . print n upto 1
public class OneTonByBackrackig {
	static void print(int i ,int n) {
		if(i < 1) return ;
		print(i-1,n);
		System.out.println(i);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit");
		int n = sc.nextInt();
		int i = n;
		print(i,n);

	}

}
