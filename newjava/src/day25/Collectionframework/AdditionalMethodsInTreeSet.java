package day25.Collectionframework;

import java.util.TreeSet;

public class AdditionalMethodsInTreeSet {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);
		System.out.println();
		System.out.println("Ceiling and higher");
		System.out.println("higher of 75 -> "+ts.higher(75));
		System.out.println("ceiling of 75 -> "+ts.ceiling(75));
		
		
		System.out.println("=======================");
		
		System.out.println("higher of 70-> "+ts.higher(70));
		System.out.println("ceiling of 70-> "+ts.ceiling(70));
		
		System.out.println();
		
		System.out.println("=======================");
		System.out.println("floor and lower");
		System.out.println("floor of 75-> "+ts.floor(75));
		System.out.println("lower of 75-> "+ts.lower(75));
	
		System.out.println();
		System.out.println("=======================");
		
		System.out.println("lower of 70-> "+ts.lower(70));
		System.out.println("floor of 70-> "+ts.floor(70));
	    System.out.println(1 % 10);		
		
	}

}
