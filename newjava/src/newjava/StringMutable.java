package newjava;

public class StringMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Md");
		sb.append("Arsh");
		System.out.println(sb); 
		
		// the initial capacity of a string buffer and string builder is 16bytes however if this capacity
		//is exceeded the string buffer or builder will inc its capacity by using the formula " newCapacity= Old capacity * 2 + 2"
		
		StringBuffer sc = new StringBuffer();
		sc.append("Ronaldo");
		System.out.println(sc.capacity());
		sc.append("is a great footballer ");
		System.out.println(sc.capacity()); 
		
		// although the default initial capacity of a string buffer and builder 
		//is 16 but we as a programmer can define (set) out own initial capacity
		
		StringBuffer sd = new StringBuffer(10);  // setting capacity as mentioned above
		System.out.println(sd.capacity());
		
		// ENSURE CAPACITY
		
		StringBuffer se = new StringBuffer();  // setting capacity as mentioned above
		System.out.println(sd.capacity());
		se.ensureCapacity(31);
		System.out.println(se.capacity());
		
		// TREAM TO SIZE
		
		StringBuffer sf = new StringBuffer();
		System.out.println(sf.capacity());
		sf.append("Ronaldo");
		System.out.println(sf.capacity());
		sf.trimToSize();
		System.out.println(sf.capacity());
		
		

	}

}
