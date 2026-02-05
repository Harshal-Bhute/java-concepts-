package day30.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SimpleObjReverseSort {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(34);
		al.add(45);
		al.add(30);
		al.add(42);
		al.add(50);
		al.add(10);
		System.out.println(al);
		Comparator c = Collections.reverseOrder();
		Collections.sort(al,c);
		System.out.println(al);
		

	}

}
