package co.day23Multithreading;



public class ThreadUnpredictability {
	

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Application Started");
		Typing2 t1 = new Typing2();
		SpellCheck2 t2=new SpellCheck2();
		Saving2 t3=new Saving2();
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Application terminated...");

	}

}
class Typing2 extends Thread  {
	public void run() {
		System.out.println("Typing Started");
		for(int i=0;i<10;i++) {
			System.out.println("Typing...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		 System.out.println("Typing terminated");
	}
	 
}

class SpellCheck2 extends Thread  {
	public void run() {
		System.out.println("SpellCheck Started");
		for(int i=0;i<10;i++) {
			System.out.println("Spell check...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println("SpellCheck terminated..");
	}
	
}

class Saving2 extends Thread  {
	public void run() {
		 System.out.println("Saving Started");
		for(int i=0;i<10;i++) {
			System.out.println("Saving...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		 System.out.println("Saving termiated...");
	}
}
