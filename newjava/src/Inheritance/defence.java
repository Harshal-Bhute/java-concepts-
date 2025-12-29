package Inheritance;

public class defence {

	public static void main(String[] args) {
		Army a= new Army();
		Navy n= new Navy();
		AirForce air= new AirForce();
		System.out.println("------------army--------------");
		a.protect();
		a.useTank();
		System.out.println("--------------navy------------");
		n.protect();
		n.useShips();
		System.out.println("-------------airForce------------");
		air.protect();
		air.useJets();

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
	void useShips() {
		System.out.println("Navy use destroyers");
	}
	
}

class AirForce extends  SecurityForce{
	void protect() {
		System.out.println("protect sky");
	}
	void useJets() {
		System.out.println("Airforce uses Su57");
	}
	
}

class Army extends  SecurityForce{
	void protect() {
		System.out.println("protect land");
	}
	void useTank() {
		System.out.println("Army uses t400");
	}
}