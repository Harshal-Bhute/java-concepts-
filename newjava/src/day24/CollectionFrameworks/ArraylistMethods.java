package day24.CollectionFrameworks;

import java.util.ArrayList;

public class ArraylistMethods {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println("a->"+a);
		ArrayList a1 = new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		System.out.println("a1->"+a1);
		a.addAll(a1);
		System.out.println("a1 merged with a using addall()->"+a);
		a.add(1, 00);
		System.out.println("using add()->"+a);
		System.out.println(a.contains(0));
		a.remove(0);
		System.out.println("after removing 0 -> "+a);
		//a.removeAll(a);
		//System.out.println(a);
		a.set(0, 1);
		System.out.println(a);
		
		

	}

}
