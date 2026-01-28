package day25.Collectionframework;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class DequeVsLinked {

	public static void main(String[] args) {
		
		long t1 = System.currentTimeMillis();
		ArrayDeque ad = new ArrayDeque();
		for(int i = 0 ; i<80000000; i++) {
			ad.push(i);
		}
		long t2 = System.currentTimeMillis();
		
		LinkedList ll = new LinkedList();
		long t3 = System.currentTimeMillis();
		for(int i = 0 ; i<80000000; i++) {
			ll.push(i);
		}
		long t4 = System.currentTimeMillis();
		System.out.println(t2-t1);
		System.out.println(t4-t3);
		

	}

}
