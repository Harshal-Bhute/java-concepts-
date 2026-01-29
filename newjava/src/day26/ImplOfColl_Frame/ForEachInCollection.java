package day26.ImplOfColl_Frame;

import java.util.ArrayList;

public class ForEachInCollection {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		arr.add(500);
		//accesing elements using for and for each loop in collections
		System.out.println(arr);
		System.out.println("By For loop a->");
		for (int i = 0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("By For each loop a->");
		for (Object x : arr) {
			System.out.print(x+" ");
		}

	}

}
