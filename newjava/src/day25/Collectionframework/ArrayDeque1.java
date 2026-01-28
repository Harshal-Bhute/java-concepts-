package day25.Collectionframework;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class ArrayDeque1 {

	public static void main(String[] args) {
		ArrayDeque  al = new ArrayDeque();
		al.add(10); //1s
		al.add(20); //1s
		al.add(30); //1s
		al.add(40); //1s
		System.out.println(al);
		al.addFirst(101);  //1s -> time requirement
		System.out.println(al);
		//al.add(2,4);   middle insertion is  not possible 

	}

}
