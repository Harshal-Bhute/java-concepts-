package co.day23Multithreading;

public class Demo {
public static void main(String[] args ) {
	Thread t =Thread.currentThread();
	t.setName("pce");
	t.setPriority(7);
	System.out.println(t);
    duty();             //there is only one thread in all over the program 

}
static void duty() {
	Thread t =Thread.currentThread();
	System.out.println(t);
}
}
