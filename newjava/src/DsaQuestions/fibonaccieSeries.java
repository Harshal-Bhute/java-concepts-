package DsaQuestions;
import java.util.Scanner;

public class fibonaccieSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the num upto which you want print ");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		if(limit<0)return ;
		System.out.print("0 ");
		if(limit==0)return ;
		System.out.print("1 ");
		int first = 0;
		int second = 1;
		
		while(first+second<limit) {
			int third = first +second;
			System.out.print(third+" ");
			first=second;
			second =third;
		}
		

	}

}
