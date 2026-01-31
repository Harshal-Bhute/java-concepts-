package day27.LegacyClasses.FetchMethods;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList  al = new ArrayList();
		al.add(100); //1s
		al.add(50);
		al.add(150); //1s
		al.add(99); //1s
		al.add(501);
		al.add(1,999);
		al.add(null); // allowed 
		
		
		for(int i = 0 ; i<al.size() ; i++) {
			System.out.print(al.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("-------------------");
		
		for (Object o : al) {
			System.out.print(o+ " ");
		}
		
		System.out.println();
		System.out.println("-------------------");
		
		Iterator i = al.iterator();
		 while(i.hasNext()) {
			 System.out.print(i.next()+" ");
		 }
		 
		 ListIterator i1 = al. listIterator(al.size());
		 
		 System.out.println();
		 System.out.println("-------------------");
		 while(i1.hasPrevious()) {
			 System.out.print(i1.previous()+" ");
		 }
		 
		 //ListIterator i = al.descendingIterator();  not possible 

	}

}
