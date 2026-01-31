package day27.LegacyClasses.sortingSimpleObj;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayDeque1 {

	public static void main(String[] args) {
		ArrayDeque ts = new ArrayDeque();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);
		ArrayList al1 = new ArrayList();
		al1.addAll(ts);   // array deque can't be sorted directly as it followa queue so 
		                   //we need to convert in into array list
		Collections.sort(al1);
		System.out.print(al1+" ");

	}

}
