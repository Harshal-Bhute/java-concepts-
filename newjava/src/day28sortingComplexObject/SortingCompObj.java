package day28sortingComplexObject;

import java.util.ArrayList;
import java.util.Collections;

public class SortingCompObj {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add("StringType");
		al.add(true);
		al.add(10.5);
		al.add(null);
		System.out.println(al);
	    Collections.sort(al);
	    System.out.println(al);
	    
	    
	    // Collections . sort cant sort complex data .So the first solution is to make it generic
	    
	    ArrayList<Integer>al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add("StringType");
		al1.add(true);
		al1.add(10.5);
		al1.add(null);
		System.out.println(al1);
	    Collections.sort(al1);
	    System.out.println(al1);

	}

}
