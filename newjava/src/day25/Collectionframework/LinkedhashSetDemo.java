package day25.Collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedhashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet ts = new LinkedHashSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);
		// insertion order preserved 
		// Hash Set is fastest for searching but linked hash set is used preserve the insertion order and use scattered memory 

	}

}
