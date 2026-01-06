package co.day23Multithreading;

import java.util.Iterator;

public class MultiThreadingEg2 {
	
	// by extending thread class

	public static void main(String[] args) {
		Typing1 type=new Typing1();
		SpellCheck1 spell =new SpellCheck1();
		Saving1 save=new Saving1();
		
		Thread t1=new Thread(type);
		Thread t2=new Thread(spell);
		Thread t3=new Thread(save);
		t1.start();
		t2.start();
		t3.start();
	}

}




class Typing1 implements Runnable  {
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

class SpellCheck1 implements Runnable   {
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

class Saving1 implements Runnable   {
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
