package co.day23Multithreading;

//how to use multi_threading in single class with multiple methods 

public class MultiThreadingEg3 {

	public static void main(String[] args) throws InterruptedException {
		
		Editor t1 =new Editor();
		Editor t2 =new Editor();
		Editor t3 =new Editor();
		t1.setName("Type");
		t2.setName("Spell");
		t3.setName("Save");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
class Editor extends Thread{
	public void run() {
		String tName=Thread.currentThread().getName();
		if(tName.equals("Type")) {
			typing();
		}else if(tName.equals("Spell")) {
			spellCheck();
		} else {
			Saving();
		}
	}
	
	public void typing() {
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
	
	public void spellCheck() {
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
	
	public void Saving() {
		System.out.println("Saving Started");
		for(int i=0;i<10;i++) {
			System.out.println("Saving...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println("Saving terminated..");
	}
	
	
}
