package day24.CollectionFrameworks;

import java.util.ArrayList;

public class ArrayListMethodsImpl1 {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		System.out.println("list1->"+arr);
		ArrayList arr1 = new ArrayList();
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(50);
		System.out.println("list2->"+arr1);
		System.out.println(arr.retainAll(arr1));
		arr.retainAll(arr1);    //gives only common elements
		
		System.out.println(arr.retainAll(arr1));
		System.out.println("list1->"+arr);
		System.out.println("list2->"+arr1);

	}

}
