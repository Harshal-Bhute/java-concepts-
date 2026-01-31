package day27.LegacyClasses.advantageOfIterator;

import java.util.ArrayList;

import java.util.Iterator;
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< SOLUTION >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//iterator overcome this by giving ConcurrentModificationException

public class Iterator2 {
		public static void main(String[] args) {
			ArrayList al = new ArrayList();
			al.add(10);
			al.add(20);
			al.add("StringType");
			al.add(true);
			al.add(10.5);
			al.add(null);
			System.out.println(al);
			Iterator ar = al.iterator();
		
			while(ar.hasNext()) {
				 System.out.print(ar.next()+" ");// read and write operations performing at the same time known as 
			     al.add(ar.next());          // concurrent modification
			 }
			

	}

}
