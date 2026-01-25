package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class First {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);  //0
		list.add(1);  //1
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		System.out.println(list.contains(1));
		System.out.println("Will be removed: "+list.remove(1));
		System.out.println(list);
		System.out.println(list.contains(1));
		System.out.println(list.get(1));
		System.out.println("===========================");
		list.add(1,20);  // will add 20 at the index 1
		list.set(1,50);  // will replace 20 with 50
		list.sort(null);
		for(int i : list) {
			System.out.println(i);
		}
		System.out.println("size of arraylist :"+list.size());
		
		//====================== diff ways List creation =======================
		
		                               //(1)
		
		List<Integer> list1= List.of(1,2,3,4,5); // has fixed size i.e immutable
		System.out.println(list1);
		System.out.println(list1.size());
		//list1.add(2);
		//System.out.println(list1.size());
		 
		                               //(2)
		
		String[] array = {"apple","Banana","Cherry"};
		for(String fruit : array) {
			System.out.println(fruit);
		}
		List<String> newlist = Arrays.asList(array);
		System.out.println(newlist);
		
		                               //(3)
		List<String> newlist1 = new ArrayList<>(newlist);
		newlist1.add("Dragonfruite");
		System.out.println(newlist1);
		
		//====================== conversion of list to array =======================
		
		List<Integer> list4 = new ArrayList<>();
		list4.add(1);
		list4.add(2);
		list4.add(3);
		list4.add(4);
		
		
		

	}

}
