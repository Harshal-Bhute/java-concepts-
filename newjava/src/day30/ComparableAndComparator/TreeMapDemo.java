package day30.ComparableAndComparator;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
//to preserve the insertion order
public class TreeMapDemo {

	public static void main(String[] args) {
		
		HashMap tm = new HashMap();
		//output in asc order of keys
		tm.put(100, 99);
		tm.put(50, 999);
		tm.put(150,9999);
		tm.put(25, 99999);
		tm.put(75, 999999);
		tm.put(125,9999999);

		System.out.println(tm);
		
		
		System.out.println("...............................................");
		
		System.out.println("Key set");
		Set s=tm.keySet();
		Iterator i=s.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
		System.out.println("...............................................");
		
		
		Collection s1 =tm.values();
		System.out.println("values");
		Iterator i1=s1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		System.out.println("...............................................");
		
		Set set=tm.entrySet();
		System.out.println("Entry set");
		Iterator i2=set.iterator();
		
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
	}

}
