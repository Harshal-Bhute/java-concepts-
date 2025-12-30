package Polymorphism;

//true example of Polymorphism with code redundancy

public class PolymorphismTrue2 {

	public static void main(String[] args) {
		
		duty(new JavaTrainer2() );
		duty(new AptiTrainer2() );
		duty(new TestingTrainer2() );
		

	}
	static void duty(Trainerr1 t) {
		t.teach();
	}
	

}
class Trainerr1 {
	void teach() {
		System.out.println("job is teaching");
	}
}

class JavaTrainer2 extends Trainerr1{
	void teach() {
		System.out.println("job is teaching java");
	}
}

	class AptiTrainer2 extends Trainerr1{
		void teach() {
			System.out.println("job is teaching Apti");
		}
}
	
	class TestingTrainer2 extends Trainerr1{
		void teach() {
			System.out.println("job is testing");
		}
}