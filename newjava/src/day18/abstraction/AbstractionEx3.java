package day18.abstraction;


public class AbstractionEx3{

	public static void main(String[] args) {
		
	System.out.println("area of circle");
	cal(new circle(5));
	System.out.println("area of triangle ");
	cal(new triangle(2,5));
	System.out.println("area of square ");
	cal(new square(5));

	}
	
	static void cal(Shapes s) {
		s.area();
		s.disp();
	}

}

abstract class Shapes{
	float area;
	abstract void disp();
	abstract void area();
	
}

class circle extends Shapes{
	int radius;
	static float pi =3.14f;
	
	
	 public circle(int radius) {
		this.radius=radius;
		
	}
	 
	void area() {
		area=(radius *radius)*pi;
	}
	
	void disp() {
		System.out.println(area);
	}
}


class triangle extends Shapes{
	int height;
	int base;
	
	
	public  triangle(int height,int base) {
		this.height=height;
		this.base=base;
		
	}
	
	void area() {
		area=0.5f*height*base;
	}
	
	
	void disp() {	
		System.out.println(area);
	}
}

class square extends Shapes{
	int side;
	
	 public square(int side) {
		this.side=side;
		
	}
	void disp() {
		System.out.println(area);
	}
	
	void area() {
		area=side*side;
	}
}

class rectangle extends Shapes{
	int length;
	int breadth;
	
	 public rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	 void area() {
			area=length*breadth;
		}
	void disp() {
		System.out.println(area);
	}
	
	
}