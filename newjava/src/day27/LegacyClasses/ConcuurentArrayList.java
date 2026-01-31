package day27.LegacyClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcuurentArrayList {
	public static void main(String[] args) {
		CopyOnWriteArrayList al = new CopyOnWriteArrayList<>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(20);
	
		Iterator ar = al.iterator();
		
		while(ar.hasNext()) {
			 System.out.print(ar.next()+" "); 
		     al.add(100);          
		 }
		
		System.out.println();
		
		Iterator ar1 = al.iterator();
		while(ar1.hasNext()) {
			 System.out.print(ar1.next()+" "); 
		               
		 }
	}

}
 
