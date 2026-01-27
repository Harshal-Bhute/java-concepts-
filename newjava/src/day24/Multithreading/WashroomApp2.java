package day24.Multithreading;
// problem solution:monitor or thread safe condition
public class WashroomApp2 {
	public static void main(String[] args) throws InterruptedException {
		Washroom2 washroom = new Washroom2();
		Thread t1 = new Thread(washroom);
		Thread t2 = new Thread(washroom);
		Thread t3 = new Thread(washroom);
		t1.setName("thor");
		t2.setName("hulk");
		t3.setName("loki");
		t1.start();
		t1.join();
		t2.start();
		t3.start();
		t3.join();
		
	}

}
class Washroom2 implements Runnable{

	@Override
	synchronized public void run() {
		
		try {
			String tName=Thread.currentThread().getName();
			System.out.println(tName+" is enter in washroom");
			Thread.sleep(3000);
			System.out.println(tName+" is using washroom");
			Thread.sleep(3000);
			System.out.println(tName+" is exiting washroom");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
