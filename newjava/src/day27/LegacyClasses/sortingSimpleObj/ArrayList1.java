package day27.LegacyClasses.sortingSimpleObj;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList ts = new ArrayList();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println("before sorting"+ts);
		Collections.sort(ts);
		System.out.println("After sorting"+ts);
		
		
		
		
	}

}
