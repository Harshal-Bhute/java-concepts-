package day27.LegacyClasses;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(5);
		System.out.println(v);
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+" ");
		}
	

	}

}
