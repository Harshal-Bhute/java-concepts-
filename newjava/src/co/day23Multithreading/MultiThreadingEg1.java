package co.day23Multithreading;

import java.util.Iterator;

public class MultiThreadingEg1 {
	
	// by extending thread class

	public static void main(String[] args) {
		
		Typing t1 = new Typing();
		SpellCheck t2=new SpellCheck();
		Saving t3=new Saving();
		t1.start();
		t2.start();
		t3.start();
		

	}

}
class Typing extends Thread  {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Typing...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class SpellCheck extends Thread  {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Spell check...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class Saving extends Thread  {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Saving...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
