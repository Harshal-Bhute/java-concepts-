package day27.LegacyClasses.FetchMethods;


import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque  al = new ArrayDeque ();
		al.add(100); //1s
		al.add(50);
		al.add(150); //1s
		al.add(99); //1s
		al.add(501);
	
		
		System.out.println("----------for loop---------");
//		for(int i = 0 ; i<al.size() ; i++) {
//			System.out.print(al.get(i)+" ");
//		}
		
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
//		 ListIterator i1 = al. listIterator(al.size());
//		 while(i1.hasPrevious()) {
//			 System.out.print(i1.previous()+" ");
//		 }
		 
		 System.out.println();
		 System.out.println("---------desc iterator----------");
		 Iterator itr = al.descendingIterator();
		 while(itr.hasNext()) {
			 System.out.print(itr.next()+" ");
		 }   

	}

}
