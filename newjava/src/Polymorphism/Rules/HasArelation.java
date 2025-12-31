package Polymorphism.Rules;
public class HasArelation {
	public static void main(String[] args) {
		Laptop l =new Laptop();
		Charger c=new Charger("dell",65);
		l.hasA(c);
		System.out.println("--------------------");
		System.out.println(l.os.getbrand());
		System.out.println(l.os.getversion());
	}
}
class Laptop{
	Os os = new Os("dell",123);
	void hasA(Charger c) {
		System.out.println(c.getbrand());
		System.out.println(c.getpower());
	}
}
class Charger{
	String brand;
	int power;
	public Charger(String brand,int power) {
		this.brand = brand;
		this.power = power;
	}
	 public String getbrand() {
			return brand;
		  }
	
	 public int getpower() {
			return power;
		  }
}
  class Os  {
		String brand;
		int version;
		public Os(String brand,int version) {
			this.brand = brand;
			this.version = version;
		}
		public String getbrand() {
			return brand;
		  }
		public int getversion() {
			return version;
		  }
	
  }
		
  		
	
	
	
	

 

