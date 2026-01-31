package day27.LegacyClasses.FetchMethods;




import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList  al = new LinkedList();
		al.add(100); //1s
		al.add(50);
		al.add(150); //1s
		al.add(99); //1s
		al.add(501);
		al.add(1,999);
		al.add(121); // allowed 
		
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
