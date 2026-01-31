
package day27.LegacyClasses.FetchMethods;




import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.concurrent.PriorityBlockingQueue;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet al = new LinkedHashSet();
		al.add(100); //1s
		al.add(50);
		al.add(150); //1s
		al.add(99); //1s
		al.add(501);
		al.add(null); // allowed 
		
		System.out.println("----------for loop---------");
		for(int i = 0 ; i<al.size() ; i++) {
			System.out.print(al.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("----------for each---------");
		
		for (Object o : al) {
			System.out.print(o+ " ");
		}
		
		System.out.println();
		System.out.println("----------iterator---------");
		
		Iterator i = al.iterator();
		 while(i.hasNext()) {
			 System.out.print(i.next()+" ");
		 }
		 
		 
		 System.out.println();
		 System.out.println("--------list iterator-----------");
		 ListIterator i1 = al. listIterator(al.size());
		 while(i1.hasPrevious()) {
			 System.out.print(i1.previous()+" ");
		 }
		 
		 System.out.println();
		 System.out.println("---------desc iterator----------");
		 Iterator itr = al.descendingIterator();
		 while(itr.hasNext()) {
			 System.out.print(itr.next()+" ");
		 }   

	}

}

 