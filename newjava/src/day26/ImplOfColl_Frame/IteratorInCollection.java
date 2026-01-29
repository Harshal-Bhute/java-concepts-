package day26.ImplOfColl_Frame;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInCollection {
	public static void main(String[] args) {
    ArrayList arr = new ArrayList();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		 Iterator itr = arr.iterator();
		 while(itr.hasNext()) {
			 System.out.print(itr.next()+" ");
		 }
		 
		
	}

}
