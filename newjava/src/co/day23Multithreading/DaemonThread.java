package co.day23Multithreading;

//Race condition overcomed using daemon thread

public class DaemonThread {
	

	public static void main(String[] args) throws InterruptedException {
	
		Typing2 t1 = new Typing2();
		SpellCheck2 t2=new SpellCheck2();
		Saving2 t3=new Saving2();
		t1.start();
		t2.start();
		t3.start();
		
		t2.setDaemon(true);
		t3.setDaemon(true);
		t2.setPriority(1);
		t3.setPriority(1);
		
	

	}

}
class Typing2 extends Thread  {
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("Typing...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	
	}
	 
}

class SpellCheck2 extends Thread  {
	public void run() {
		
		for(;;) {
			System.out.println("Spell check...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	
	}
	
}

class Saving2 extends Thread  {
	public void run() {

		for(;;) {
			System.out.println("Saving...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		
	}
}