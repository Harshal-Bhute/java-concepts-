package Polymorphism;

//true Polymorphism

public class PolymorphismTrue {

	public static void main(String[] args) {
		Trainerr t;
		
		 t = new JavaTrainer1();
		 t.teach();
		 t = new AptiTrainer1();
		 t.teach();
		 t = new TestingTrainer1();
		 t.teach();

	}

}
class Trainerr {
	void teach() {
		System.out.println("job is teaching");
	}
}

class JavaTrainer1 extends Trainerr{
	void teach() {
		System.out.println("job is teaching java");
	}
}

	class AptiTrainer1 extends Trainerr{
		void teach() {
			System.out.println("job is teaching Apti");
		}
}
	
	class TestingTrainer1 extends Trainerr{
		void teach() {
			System.out.println("job is testing");
		}
}