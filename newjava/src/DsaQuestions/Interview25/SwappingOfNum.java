package DsaQuestions.Interview25;

import java.util.Scanner;

public class SwappingOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b : ");
		int b = sc.nextInt();
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println("new a : "+a);
//		System.out.println("new b : "+b);
		
               // without temp using XOR (a^b)  
		a = a^b;   // new value
		b = a^b;   // will get original a (a^b)^b = a^(b^b)=a^0=a
		a = a^b;   //(a^b)^b=(a^b)^a=(a^a)^b=0^b=b
		System.out.println("new a :"+a);
		System.out.println("new b :"+b);
		
		
	}

}
