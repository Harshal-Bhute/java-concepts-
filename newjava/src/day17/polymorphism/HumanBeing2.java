package day17.polymorphism;

public class HumanBeing2 {

	public static void main(String[] args) {
		Student1 s =new Student1();
		System.out.println(s.h.getweight());
		System.out.println(s.h.getduty());
		System.out.println("===================================");
		System.out.println(s.b.getiq());
		System.out.println(s.b.getweight());
		Book1 book =new Book1("Robert Greenee",200);
		s.has(book);
		System.out.println("===================================");
		Bike1 bike=new Bike1(33,"Sports");
		s.hasA(bike);

	}

}

class Human{
	heart1 h=new heart1(25,"Pumping blood");
	brain1 b = new brain1(200,1400);
}

class Student1 extends Human{
	
	void hasA(Bike1 bike) {
		System.out.println(bike.getmilage());
		System.out.println(bike.gettype());
	}
	void has(Book1 book) {
		System.out.println(book.getauthor());
		System.out.println(book.getprice());
	}
}


class heart1{
	int weight;
	String duty;


public heart1(int weight,String duty) {
	this.weight=weight;
	this.duty=duty;
}

  int getweight() {
	return weight;
}

String getduty() {
	return duty;
}

}

class brain1{
	int iq;
	int weight;
	
	public brain1(int iq,int weight) {
		this.iq=iq;
		this.weight=weight;
	}
	
	int getiq() {
		return iq;
	}
	int getweight() {
		return weight;
	}
}

class Book1{
	String author;
	int price;
	
	public Book1(String author,int price) {
		this.author=author;
		this.price=price;
	}
	
	String getauthor() {
		return author;
	}
	
	int getprice() {
		return price;
	}
}

class Bike1{
	int milage;
	String type;
	
	public Bike1(int milage,String type) {
		this.milage=milage;
		this.type=type;
	}
	int getmilage() {
		return milage;
	}
	
	String gettype() {
		return type;
	}
}