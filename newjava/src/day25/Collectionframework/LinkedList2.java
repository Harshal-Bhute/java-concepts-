package day25.Collectionframework;

import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList  ll = new LinkedList();
		ll.add(100); 
		ll.add(50); 
		ll.add(150); 
		ll.add(99); 
		ll.add(501);
		ll.add(1,999);
		System.out.println(ll);
		System.out.println("element at 1 pos ->"+ll.get(1));
		
		// additional methods of linked 

		LinkedList  ll1 = new LinkedList();
		ll1.push(10); 
		ll1.push(20);   // will behave like the stack 
		ll1.push(30);
		ll1.push(40); 
		ll1.push(50);   
		ll1.push(60);
		
		System.out.println(ll1);
		
		ll1.pop();     // will delete the top(first) element
		
		System.out.println(ll1);
		
		// peek() only shows element at a particular position it don"t delete any
		// whereas .poll() will show and delete the top(first) element
		
		System.out.println(ll1.peek()); // top (first) element in stack
		System.out.println(ll1.peekFirst()); // top (first) element in stack
		System.out.println(ll1.peekLast()); // botton (last) element in stack
		System.out.println(ll1);
		System.out.println(ll1.poll());  // it shows as well as delete the top element
		System.out.println(ll1);
		
		
		
		
	}

}
