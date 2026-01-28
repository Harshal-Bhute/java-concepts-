package day25.Collectionframework;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList  al = new LinkedList();
		al.add(100); //1s
		al.add(50); //1s
		al.add(150); //1s
		al.add(99); //1s
		al.add(501);
		al.add(1,999);
		System.out.println(al);
		// additional methods of linked list
		System.out.println(al.get(1));

	}

}
