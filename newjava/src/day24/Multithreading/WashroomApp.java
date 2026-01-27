package day24.Multithreading;
//problem statement : Only one thread is allowed to enter the method known as non monitor or non-semaphor 
public class WashroomApp {
	public static void main(String[] args) throws InterruptedException {
		Washroom washroom = new Washroom();
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
class Washroom implements Runnable{

	@Override
	public void run() {
		
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
