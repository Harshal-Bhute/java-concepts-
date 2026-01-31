package day26.ImplOfColl_Frame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class DescendingIterator {
	public static void main(String[] args) {
	 LinkedList arr = new LinkedList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);             //   |10|20|30|40|50|60|  <--  itr  starts from this end facing reverse 
		arr.add(50);
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		Iterator itr = arr.descendingIterator();
		 while(itr.hasNext()) {
			 System.out.print(itr.next()+" ");
		 }

}
}
