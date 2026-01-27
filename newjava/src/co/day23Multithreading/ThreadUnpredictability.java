package co.day23Multithreading;



public class ThreadUnpredictability {
	

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Application Started");
		Typing3 t1 = new Typing3();
		SpellCheck3 t2=new SpellCheck3();
		Saving3 t3=new Saving3();
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Application terminated...");

	}

}
class Typing3 extends Thread  {
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

class SpellCheck3 extends Thread  {
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

class Saving3 extends Thread  {
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
