package Polymorphism;

public class PolynorphismTrue3 {

	public static void main(String[] args) {
		Tendulkar t = new Arjun();
		t.job();
		t.profession();
	    //t.smoke();
		// que.Why we need method overriding?
		// parent class can't access smoke method bcz it is a specialized method in child class i.e it is not present in 
		//parent class thats why we need to use method overriding.
		((Arjun)t).smoke();   // Downcasting  
		

	}

}

class Tendulkar {
	void job() {
		System.out.println("play cricket");
	}
	void profession() {
		System.out.println("he is batsman");
	}
}

class Arjun extends Tendulkar{
	void profession() {
		System.out.println("he is bowler");
	}
	
void smoke() {
	System.out.println("Smokes ");
}
}