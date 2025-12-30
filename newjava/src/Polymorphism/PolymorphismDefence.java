package Polymorphism;



public class PolymorphismDefence {

	public static void main(String[] args) {
		duty(new Navy());
		duty(new AirForce());
		duty(new Army());

	}
	
	static void duty(SecurityForce f) {
		f.protect();
	}

}

 class SecurityForce{
	
	void protect() {
		System.out.println("protect nation");
	}
}



class Navy extends  SecurityForce{
	void protect() {
		System.out.println("protect ocean");
	}
	
	
}

class AirForce extends  SecurityForce{
	void protect() {
		System.out.println("protect sky");
	}
	
}

class Army extends  SecurityForce{
	void protect() {
		System.out.println("protect land");
	}
	
}