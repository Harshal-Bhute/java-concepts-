package day27.LegacyClasses.advantageOfIterator;

import java.util.ArrayList;
// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< PROBLEM >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
/*Chatgpt:-When a collection is structurally modified during iteration,
Iterator detects it immediately and throws ConcurrentModificationException*/

/*While reading the content in the structure concurrently modification to the structure is happen by writing the data 
 * into the structure for loops are not designed to identify the structural modification*/

public class Iterator1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add("StringType");
		al.add(true);
		al.add(10.5);
		al.add(null);
		System.out.println(al);
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i)+ " ");
			al.add(i);
		}
		
	}

}

	
